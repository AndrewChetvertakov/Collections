package algorithms_and_datastructures_course.recursion_practice;

public class Recursive_Factorial {
    public static void main(String[] args) {

        int value = find_factorial_recursively(6);
        System.out.println("final result = "+value);

    }

    public static int find_factorial_recursively(int n){
        if( n < 0) return -1;
        if (n <= 1) return 1;
        return n * find_factorial_recursively(n-1);
    }

}
