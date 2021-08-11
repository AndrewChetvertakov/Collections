import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
//    int[] a = {3,2,1};
//    int[] b = a.clone();
//    Arrays.sort(b);
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
        System.out.println(oneTwo("tcagdo"));
        System.out.println("xyBalance: " + xyBalanceKibi("aaxbby"));
        /*
        xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
         */
        int[][] arr = new int[2][];
        double[][] arr1 = new double[][]{{},{}};
//        long[][] arr3 = new long[2][2]{ {1,2}, {3,4}};
        int[][] arrasd = {{'a','b'},{'c','d'}};
        int ivar = 100;
        double dvar = 123;
        float fvar = 200;
//        ivar = fvar;  //4
//        fvar = ivar;
//        dvar = fvar;
//        fvar = dvar; //7
//        dvar = ivar;
//        ivar = dvar; //9

    }

    public static String oneTwo(String str) {
        if (str.length() < 3) {
            return str;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i += 3) {
            builder.append(str.substring(i + 1, i + 3)).append(str.charAt(i));
        }
        return builder.toString();
    }

    public static boolean xyBalance(String str) {
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                result = false;
            } else if (str.charAt(i) == 'y') {
                result = true;
            }
        }
        return result;
    }

    public static boolean xyBalanceKibi(String str) {
        boolean result = true;
        if (str.indexOf('x') > str.indexOf('y')) {
            result = false;
        }
        return result;
    }
}