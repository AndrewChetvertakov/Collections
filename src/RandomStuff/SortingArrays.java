package RandomStuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortingArrays {
    public static void main(String[] args) {
// 1, 8, 6, 10, 7, 9, 4, 3, 2, 5

        int[] nums = {1, 8, 6, 10, 7, 9, 4, 3, 2, 5};
        ArrayList<Integer> sort = new ArrayList<Integer>(Arrays.asList(1, 8, 6, 10, 7, 9, 4, 3, 2, 5));
        System.out.println(sort);
        int[] arr = new int[10];

        int counter = 0;

        // 1, 8, 6, 10, 7, 9, 4, 3, 2, 5
        // 1, 8, 6, 10, 7, 9, 4, 3, 2, 5
        // 1 ==> 0 times bigger than anything else;
        // 8 ==> 7 times bigger than anything else;
        // 6 ==> 5 times bigger than all other elements;
        //

        Set<Integer> pew = new HashSet<>(Arrays.asList(1, 8, 6, 10, 7, 9, 4, 3, 2, 5));
        System.out.println("Set: " + pew);



        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if(nums[i] < nums[j]){
                    counter++;
                }
            }

            sort.set(counter, nums[i]);
            arr[counter] = nums[i];
            counter = 0;
        }

        System.out.println(sort);
        System.out.println(Arrays.toString(arr));
    }
}
