package LeetCode.maps;

import java.util.HashMap;
import java.util.Map;

public class T_2190_Most_Frequent_Number_Following_Key_In_an_Array {
    // https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/
    public static void main(String[] args) {
        T_2190_Most_Frequent_Number_Following_Key_In_an_Array obj =
                new T_2190_Most_Frequent_Number_Following_Key_In_an_Array();
        int[] input = {2,1000,2,1000,2,3};
        int key = 2;

        System.out.println(obj.mostFrequent(input, key));

    }

    private int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> map = new HashMap<>();
        int target = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]==key){
                if(map.containsKey(nums[i+1])) map.put(nums[i+1], map.get(nums[i+1]) +1);
                else map.put(nums[i+1], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > count){
                target = entry.getKey();
                count = entry.getValue();
            }
        }
        return target;

    }
}
