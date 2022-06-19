package LeetCode.MixedTasks;

public class T_1779_Find_Nearest_Point_That_Has_the_Same_X_or_Y_Coordinate {
    // https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
    public static void main(String[] args) {
        T_1779_Find_Nearest_Point_That_Has_the_Same_X_or_Y_Coordinate obj =
                new T_1779_Find_Nearest_Point_That_Has_the_Same_X_or_Y_Coordinate();
        int[][] input = {{1,2},{3,1},{2,4},{2,3},{4,4}}; //Expected = 2
        int[] coordinates = {3, 4};
        int expected = 2;
        System.out.printf("Expected = %s \nActual   = %s",
                expected,
                obj.nearestValidPoint(coordinates[0], coordinates[1], input));
    }

    private int nearestValidPoint(int x, int y, int[][] points) {
        int min_manhattan = Integer.MAX_VALUE;
        int current_manhattan = 0;
        int index = -1;
        for(int i=0; i < points.length; i++) {
            if(x==points[i][0] || y==points[i][1]) {
                current_manhattan = Math.abs(x-points[i][0]) + Math.abs(y - points[i][1]);
                if(min_manhattan > current_manhattan){
                    index = i;
                    min_manhattan = current_manhattan;
                }
            }
        }
        return index;
    }
}
