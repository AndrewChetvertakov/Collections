package recursion;

import java.util.Random;

public class GridTraveling {
    public static void main(String[] args) {




    }
        //TODO are we traveling or what
//    public static int grid_traveler(int x, int y) {
//        if(x <= 0 || y <=0) return 0;
//        if(x==1 || y == 1) return 1;
//        else if(x > 1) return grid_traveler(x-1, y);
//        else if(y > 1) return grid_traveler(x, y-1);
//    }

    public static int[][] grid_generator(int rows, int columns) {
        Random random = new Random();
        int[][] arr = new int[rows][columns];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                arr[r][c] = random.nextInt(100);
            }
        }
        return arr;
    }

}
