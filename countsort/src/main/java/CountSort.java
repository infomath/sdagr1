/**
 * Created by klb on 26.07.17.
 */
public class CountSort {

    public static void main(String argsp[]) {
        char[]t = {'e', 'c', 'a', 'a', 'd', 'e', 'd' };
        sort(t);
        for(char el : t) {
            System.out.print(el + " ");
        }
    }

    private static int insert(char[] t, char s, int k, int n) {
        for(int i = 0; i < n; i++) {
            t[k++] = s;
        }
        return k;
    }

    public static void sort(char []t) {
        int a = 0; int b = 0; int c = 0;  int d = 0; int e = 0;
        for(char el : t) {
            switch(el) {
                case 'a': a++;
                break;
                case 'b': b++;
                    break;
                case 'c': c++;
                    break;
                case 'd': d++;
                    break;
                case 'e': e++;
                    break;
            }
        }  //n + n = 2n nal O(n)
        int k = 0;
        k = insert(t, 'a', k, a);
        k = insert(t, 'b', k, b);
        k = insert(t, 'c', k, c);
        k = insert(t, 'd', k, d);
        k = insert(t, 'e', k, e);

//        for(int i = 0; i < a; i++) {
//            t[k++] = 'a';
//        }
//        for(int i = 0; i < b; i++) {
//            t[k++] = 'b';
//        }
//        for(int i = 0; i < c; i++) {
//            t[k++] = 'c';
//        }
//        for(int i = 0; i < d; i++) {
//            t[k++] = 'd';
//        }
//        for(int i = 0; i < e; i++) {
//            t[k++] = 'e';
//        }
    }
}



















