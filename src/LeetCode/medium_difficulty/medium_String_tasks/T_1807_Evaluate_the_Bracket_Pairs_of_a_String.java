package LeetCode.medium_difficulty.medium_String_tasks;

import java.util.*;

public class T_1807_Evaluate_the_Bracket_Pairs_of_a_String {
//    https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/
    public static void main(String[] args) {
        T_1807_Evaluate_the_Bracket_Pairs_of_a_String obj = new T_1807_Evaluate_the_Bracket_Pairs_of_a_String();
        String input = "(name)is(age)yearsold";
        List<List<String>> knowledge = new ArrayList<>(){{
            add(new ArrayList<>(Arrays.asList("name","bob")));
            add(new ArrayList<>(Arrays.asList("age","two")));
        }};
        System.out.printf("Input String = %s\n", input);
        System.out.printf("Result = %s\n", obj.evaluate(input, knowledge));
        System.out.printf("Knowledge = %s", knowledge);
    }

    private String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for(List<String> key_value : knowledge) {
            map.put(key_value.get(0), key_value.get(1));
        }
        int len = s.length();
        StringBuilder builder = new StringBuilder(len);
        int start = 0;
        int end = 0;
        while(start < len) {
            char cur_char = s.charAt(start);
            if(cur_char == '(') {
                end = start;
                while(s.charAt(end) != ')') end++;
                String substr = s.substring(start+1, end);
                if( map.get(substr) == null) builder.append('?');
                else builder.append(map.get(substr));
                start = end;
            }
            else builder.append(cur_char);
            start++;
        }
        return new String(builder);
    }
}
