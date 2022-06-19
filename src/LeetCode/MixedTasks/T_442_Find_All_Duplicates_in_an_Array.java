package LeetCode.MixedTasks;

import java.util.*;

public class T_442_Find_All_Duplicates_in_an_Array {
    // https://leetcode.com/problems/find-all-duplicates-in-an-array/
    public static void main(String[] args) {
        T_442_Find_All_Duplicates_in_an_Array obj = new T_442_Find_All_Duplicates_in_an_Array();
        int[] input = {4, 3, 2, 7, 8, 2, 3, 1}; //expected: {2, 3}


    }

    // first version 18% speed
    private List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(set.contains(num) ) result.add(num);
            else set.add(num);
        }
        return result;
    }

    //second version 26% speed
    private List<Integer> findDuplicates_ver2(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if( nums == null || nums.length < 2) return result;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) result.add(nums[i]);
        }
        return result;
    }

    //third version 100% speed
    private List<Integer> findDuplicates_var3(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            int val = Math.abs(nums[i]);
            if(nums[val - 1] < 0) result.add(val);
            nums[val - 1] *= -1;
        }
        return result;
    }
}
