import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        int [] nums ={3, 2, 1, 8, 9, -4,-6};
        // The pair whose sum is closest to zero :

        int[] pew= new int[2];
        int temp;
        int min= Integer.MAX_VALUE;;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i==j){continue;}
                temp = nums[i]+nums[j];
                if (Math.abs(temp) < Math.abs(min)){
                    min = Math.abs(temp);
                pew[0] = nums[i];
                pew[1] = nums[j];}
            }
        }
        System.out.println(Arrays.toString(pew));
    }
}
