package LeetCode.MixedTasks;

public class T_766_Toeplitz_Matrix {
    // https://leetcode.com/problems/toeplitz-matrix/
    public static void main(String[] args) {
        T_766_Toeplitz_Matrix obj = new T_766_Toeplitz_Matrix();
        int[][] input = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        boolean expected = true;
        System.out.printf("Expected = %s\nActual   = %s\n", expected, obj.isToeplitzMatrix(input));
    }

    private boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0; i < matrix.length; i++)    if (checkDiagonal(matrix, i, 0)) return false;
        for(int j=0; j < matrix[0].length; j++) if (checkDiagonal(matrix, 0, j)) return false;
        return true;
    }

    private boolean checkDiagonal(int[][] matrix, int i, int j) {
        int value = matrix[i][j];
        while(i < matrix.length && j < matrix[i].length) if(matrix[i++][j++] != value) return true;
        return false;
    }
}
