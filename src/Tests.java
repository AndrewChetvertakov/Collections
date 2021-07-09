import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
    int[] a = {3,2,1};
    int[] b = a.clone();
    Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }
}
