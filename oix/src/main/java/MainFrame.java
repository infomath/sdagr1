import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

/**
 * 0 1 2 3 4 5 6 7 8
 * s s s * * * * * *
 *
 *  * 0 1 2 3 4 5 6 7
 *    * * * s s s * *
 */
public class MainFrame extends JFrame implements ActionListener{
    private List<JButton> buttons;
    private Container container;
    private final static int NUM_OF_BUTTONS = 9;
    //ref na aktualnego gracza
    private PLAYER player = PLAYER.O; //informacja ktory gracz ma kolejny ruch
    private int turn = 0;  //dzieki tej zmiennej mozna sprawdzic czy jest remis

    private void createButtons() {
        for(int i = 0; i < NUM_OF_BUTTONS; i++) {
            JButton button = new JButton("");
            buttons.add(button);
            container.add(button);
            button.addActionListener(this);
        }
    }

    public MainFrame(String title) {
        super(title);
        buttons = new LinkedList<JButton>();
        container = getContentPane();
        setLayout(new GridLayout(3, 3));
        createButtons();
        setMinimumSize(new Dimension(300, 300));
        setMaximumSize(new Dimension(800, 800));
        setLocation(100, 100);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton button  = (JButton)actionEvent.getSource();
        if(player == PLAYER.O) {
            button.setText("O");
            player = PLAYER.X;
        } else {
            button.setText("X");
            player = PLAYER.O;
        }
        turn++;
        button.setEnabled(false);

        GAME_RESULT result = checkWinner(PLAYER.O);
        if(result == GAME_RESULT.WIN) {
            JOptionPane.showMessageDialog(null, "Wygral gracz O");
            System.exit(0);
        } else {
            result = checkWinner(PLAYER.X);
            if(result == GAME_RESULT.WIN) {
                JOptionPane.showMessageDialog(null, "Wygral gracz X");
                System.exit(0);
            }
        }

        if(result == GAME_RESULT.DRAW) {
            JOptionPane.showMessageDialog(null, "Remis");
            System.exit(0);
        }

    }

    //funkcja zwraca informacje o wygranej danego gracza gdy
    //w danym rzedzie albo przekatnej istnieja takie same symbole s
    private GAME_RESULT checkWinner(PLAYER player) {
        String s = player.toString();
        boolean winner = false;
        //3i, 3i+1, 3i+2
        for(int i = 0; i < 3; i++) {
            //sprawdzenie czy w i-tym wierszu istnieja 3 takie same symbole
            if(buttons.get(3*i).getText().equals(s) && buttons.get(3*i+1).getText().equals(s) && buttons.get(3*i+2).getText().equals(s)){
                winner = true;
                break;
            }
            //i, i+3, i+6
            if(buttons.get(i).getText().equals(s) && buttons.get(i+3).getText().equals(s) && buttons.get(i+6).getText().equals(s)){
                winner = true;
                break;
            }
        }        //sprawdzenie czy dany gracz wygral "na przekatnej"
        if(buttons.get(0).getText().equals(s) && buttons.get(4).getText().equals(s) && buttons.get(8).getText().equals(s) ||
                buttons.get(2).getText().equals(s) && buttons.get(4).getText().equals(s) && buttons.get(6).getText().equals(s) ){
            winner = true;
        }
        if(winner) {
            return GAME_RESULT.WIN;
        } else {
            //jest remis
            if(turn == 9){
                return GAME_RESULT.DRAW;
            } else {
                return GAME_RESULT.NOBODY_WON;
            }
        }
    }

}
