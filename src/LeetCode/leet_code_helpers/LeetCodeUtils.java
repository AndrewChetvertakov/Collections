package LeetCode.leet_code_helpers;

import java.util.Arrays;
import java.util.Random;

public class LeetCodeUtils {
    public static void main(String[] args) {
        LeetCodeUtils obj = new LeetCodeUtils();
        String[] input = {"[[1,3],[2,2],[3,1]]"

                                                 };
        System.out.println(obj.replacer(input[0]));

    }

    private String replacer(String input){
        return input.replace("[", "{").replace("]", "}");
    }

    public int[] generate_random_array(int arr_length, int upperBound) {
        int[] numbers = new int[arr_length];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(upperBound);
        }
        return numbers;
    }

    public void print_Arrays(int[]... ints) {
        int i = 1;
        for(int[] arr: ints)
            System.out.println("Array number " + i++ + " = " + Arrays.toString(arr));
    }
}
