package chainofrespons;


public class PlusOperation extends OperationExecutor {
    @Override
    public void compute(String part) {  //part - token: operator liczba
        String parts[] = part.split(" ");
        if(parts[0].equals("+")) {
            result += Double.parseDouble(parts[1]);
            return;
        }

        //przekazujemy zadanie do obliczenia tego fragmentu, kolejnemu obiektowi
        //lancucha
        if(nextOperation != null) {
            nextOperation.compute(part);
        }

    }
}
