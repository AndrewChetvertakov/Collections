package random_practice.MJ_office_hours.another_day;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
//      {([)]}()    <--- not balanced
//        1) the number of opening and the number of closing should match
//        2) you should close the inner parenthesis first and then go outer
//           meaning same order of closing as opening

        // [{()}] <--- do it in a simple way first:
        // List with open brackets = [, {, (
        // List of closed brackets = ), }, ]
// We can fist collect the brackets into 2 different list and then assert the size

 // Stack: LIFO - last in first out.
        // push() --  add to the top of the stack
        // pop() -- return last index from stack and remove it from stack at the same time.

         String input = "{}()[]{([])}";
         String input2 = "]"; // <--- empty stack exception
        System.out.println(isBalanced(input));
    }
// problem with when our input is only "]" or "["
    public static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);
            if(current == '(' || current == '{' || current == '[') stack.push(current);

            else {
                switch (current){
                    case ')': if(stack.pop() != '(') return false;
                    case '}': if(stack.pop() != '{') return false;
                    case ']': if(stack.pop() != '[') return false;
                }
            }

        }
        return stack.size() != 0;
    }

//below one is a proper way to solve this:
public static boolean isBalanced2(String str) {

    List<Character> opening = new ArrayList<>();
    List<Character> closing = new ArrayList<>();

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
            opening.add(str.charAt(i));
        } else if ((str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') )  {
            closing.add(str.charAt(i));
        }
    }

    if (opening.size() != closing.size()){
        return false;
    }

    int lastIndex = opening.size() -1;

    for (int i = 0; i < opening.size(); i++) {
        switch (str.charAt(i)) {

            case '{':
                if (closing.get(lastIndex -i) != '}') {
                    return false;
                }
            case '[':
                if (closing.get(lastIndex -i) != ']') {
                    return false;
                }
            case '(':
                if (closing.get(lastIndex -i) != ')') {
                    return false;
                }
        }
    }


    return true;
}


}
