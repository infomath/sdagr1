/**
 * Created by klb on 04.08.17.
 */
public class SpecialMathImpl implements SpecialMath {

    private final static int n = 200;

    //metoda oblicza pole pod funkcja fun w przedziale od a do b
    //czyli calke oznaczona
    @Override
    public double integral(double a, double b, IFun fun) {
        double result = 0;

        double d = (b-a)/n;

        for(int i = 1; i <= n; i++) {
            result += fun.f(a + i*d);
        }
        return d*result;
    }
}
