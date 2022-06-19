package LeetCode.MixedTasks;

public class T_908_Smallest_Range_I {
    //  https://leetcode.com/problems/smallest-range-i/
    public static void main(String[] args) {
        T_908_Smallest_Range_I obj = new T_908_Smallest_Range_I();
        int[] input = {1, 2, 3, 4 ,5 ,6 ,7 ,8 ,9};
        int k = 2, expected = 4;
        System.out.printf("Actual   = %s\nExpected = %s",
                obj.smallestRangeI(input, k),
                expected);
    }

    private int smallestRangeI(int[] nums, int k) {
        int min_num = nums[0], max_num = nums[0];
        for(int num : nums) {
            if(num < min_num) min_num = num;
            else if(num > max_num) max_num = num;
        }
        int difference = max_num - min_num - 2 * k;
        return difference < 0 ? 0 : difference;
    }
}
