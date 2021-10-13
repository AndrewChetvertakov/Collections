package recursion_practice;

public class Recursive_Fibonacci {
    public static void main(String[] args) {

        int value = find_Fibonacci_recursively(10);
        System.out.println(value);
    }

    public static int find_Fibonacci_recursively(int n){
        if (n == 1 || n == 2) return 1;
        else if (n <= 0) return 0;
        else return find_Fibonacci_recursively(n-2) + find_Fibonacci_recursively(n-1);
    }
}
