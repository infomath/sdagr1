package chainofrespons;

/**
 * Created by klb on 21.08.17.
 */
public abstract class OperationExecutor {
    protected  static double result = 0;
    protected OperationExecutor nextOperation;

    public void setNextOperation(OperationExecutor nextOperation) {
        this.nextOperation = nextOperation;
    }

    public static double getResult() {
        return result;
    }

    //ta metoda bedzie aktualizowala wynik (result) na podstawie pewnego fragmentu
    //wyrazenia ktore chcemy obliczyc
    public abstract void compute(String part);

}
