package LeetCode.MixedTasks;

public class T_1822_Sign_of_the_Product_of_an_Array {
//    https://leetcode.com/problems/sign-of-the-product-of-an-array/
    public static void main(String[] args) {
        // too easy to write inputs...
    }

    private int arraySign(int[] nums) {
        int zeros = 0;
        for(int num : nums) {
            if(num == 0) return 0;
            zeros += num < 0 ? 1 : 0;
        }
        return zeros % 2 == 0 ? 1 : -1;
    }
}
