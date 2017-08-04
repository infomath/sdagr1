import javax.swing.*;

/**
 * Created by klb on 04.08.17.
 */
public class MainFrame extends JFrame {

    private JLabel functionLabel = new JLabel("Function");
    private JLabel aLabel = new JLabel("a");
    private JTextField tfA = new JTextField();
    private JLabel bLabel = new JLabel("b");
    private JTextField tfB = new JTextField();
    private JComboBox functions = new JComboBox
            (new String[]{"f(x)=x", "f(x)=x^2", "f(x)=sin(x)"});

    private JButton computeLabel = new JButton("Compute");

    public MainFrame(String title) {
        super(title);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(functionLabel);
        mainPanel.add(functions);
        mainPanel.add(aLabel);
        mainPanel.add(tfA);
        mainPanel.add(bLabel);
        mainPanel.add(tfB);
        mainPanel.add(computeLabel);
        computeLabel.addActionListener((e) -> {

                    Double a = null, b = null;

                    try {
                        a = Double.parseDouble(tfA.getText());
                        b = Double.parseDouble(tfB.getText());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, "Incorrect value", "", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    int index = functions.getSelectedIndex();
                    SpecialMathImpl specialMath = new SpecialMathImpl();
                    switch(index) {
                        case 0:
                            double result = specialMath.integral(a, b, x->x);
                            System.out.println("calka z f(x)=x");

                            //wyswietlenie wyniku obliczania calki w oknie dialogowym
                            break;
                        case 1:
                            System.out.println("f(x)=x^2");
                        break;
                        case 2:
                            System.out.println("f(x)=sin(x)");
                            break;
                    }
                });

        add(mainPanel);
        setVisible(true);
        setSize(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MainFrame("Integral");
    }
}
