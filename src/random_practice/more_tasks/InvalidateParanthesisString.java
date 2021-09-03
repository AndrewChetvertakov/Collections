package random_practice.more_tasks;

import java.util.Stack;

public class InvalidateParanthesisString {

    public static void main(String[] args) {
        String s = "()()";
        System.out.println("result: "+isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length(); i++){

            char c = s.charAt(i);

            if(c=='{' || c=='(' || c=='[') stack.push(c);

            else if(c=='}' || c==')' || c==']')

                System.out.println("peek = "+stack.peek());
                if(stack.pop() != c) return false;
        }
        System.out.println("size = "+stack.size());
        return stack.size()==0;
    }


}
