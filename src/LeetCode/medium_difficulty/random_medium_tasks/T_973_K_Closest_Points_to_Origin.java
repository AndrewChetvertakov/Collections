package LeetCode.medium_difficulty.random_medium_tasks;

import java.util.Arrays;
import java.util.Comparator;

public class T_973_K_Closest_Points_to_Origin {
    // https://leetcode.com/problems/k-closest-points-to-origin/
    public static void main(String[] args) {
        T_973_K_Closest_Points_to_Origin obj = new T_973_K_Closest_Points_to_Origin();

        int[][] input = {   {9997,9997},
                            {9996,9998}
                        };
        int k = 1;
        int[][] expected = {{9997,9997}};
        System.out.println(Arrays.deepToString(obj.kClosest(input, k)));
        System.out.println(Arrays.deepToString(expected));
    }

    private int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        Arrays.sort(points, Comparator.comparingInt(a -> (a[0] * a[0] + a[1] * a[1])));
        System.arraycopy(points, 0, result, 0, k);
        return result;
    }

}
