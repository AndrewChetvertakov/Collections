package LeetCode.MixedTasks;

import java.util.Stack;

public class T_1544_Make_The_String_Great {
//    https://leetcode.com/problems/make-the-string-great/
    public static void main(String[] args) {
        T_1544_Make_The_String_Great obj = new T_1544_Make_The_String_Great();
        String input = "cllLaRrritTtyYy";
        System.out.println(obj.makeGood(input));
    }

    private String makeGood(String s) {
        if(s == null || s.length() < 2) return s;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) stack.pop();
            else stack.push(c);
        }
        StringBuilder builder = new StringBuilder();
        for(Character c : stack) builder.append(c);
        return new String(builder);
    }

}
