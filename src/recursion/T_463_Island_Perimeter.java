package recursion;

public class T_463_Island_Perimeter {
    // https://leetcode.com/problems/island-perimeter/
    public static void main(String[] args) {
        T_463_Island_Perimeter obj = new T_463_Island_Perimeter();

        // expected 16;
        int[][] grid = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};

        System.out.println(obj.islandPerimeter(grid));
    }

    public int islandPerimeter(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++)
                if (grid[i][j] == 1) return count_edges(grid, i, j);
        }
        return 0;
    }

    //TODO fix StackOverflow, error in conditions
    private int count_edges(int[][] grid, int y, int x) {

        //look right
        if (x < grid[y].length - 1 && grid[y][x+1] == 1) return look_around(grid, y, x) + count_edges(grid, y, x + 1);

        // look  left
        if (x > 0 && grid[y][x] == 1) return look_around(grid, y, x) + count_edges(grid, y, x - 1);

        // look down
        if (y < grid.length - 1 && grid[y + 1][x] == 1) return look_around(grid, y, x) + count_edges(grid, y + 1, x);

        // look up
        if (y > 0 && grid[y - 1][x] == 1) return look_around(grid, y, x) + count_edges(grid, y - 1, x);

        return look_around(grid, y, x);
    }

    private int look_around(int[][] grid, int y, int x) {
        int count = 0;
        // look down
        if (y == grid.length || grid[y + 1][x] != 1) count++;

        //look up
        if (y == 0 || grid[y - 1][x] != 1) count++;

        //look right
        if (x == grid[y].length || grid[y][x + 1] != 1) count++;

        //look left
        if (x == 0 || grid[y][x - 1] != 1) count++;

        return count;
    }

//    private int look_around_2(int[][] grid, int i, int j) {
//        int peremetr = 0;
//            if (i - 1 < 0 || grid[i - 1][j] != 1) {
//                peremetr++;
//            }
//            if (j - 1 < 0 || grid[i][j - 1] != 1) {
//                peremetr++;
//            }
//            if (i + 1 >= grid.length || grid[i + 1][j] != 1) {
//                peremetr++;
//            }
//            if (j + 1 >= grid[i].length || grid[i][j + 1] != 1) {
//                peremetr++;
//        }
//        return peremetr;
//    }
}