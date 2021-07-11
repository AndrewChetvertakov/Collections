package LeetCode.medium_String_tasks;

public class LongestPalindromicSubstringAnotherOne {
    public static void main(String[] args) {
        String input = "l2eve1l";
        System.out.println(longestPalindrome(input));
    }

    public static String longestPalindrome(String s) {
        char[] input = s.toCharArray();
        int[] indexes = new int[2];

        for (int i = 0; i < input.length; i++) {
            checkP(input, indexes, i, i+1);
            checkP(input, indexes, i, i);
        }

        return s.substring(indexes[0], indexes[1]);
    }

    public static void checkP(char[] input, int[] indexes, int start, int end){
        int inputL = input.length;

        while(start >=0 && end <= inputL-1){
            if(input[start] != input[end]){
                break;
            }
            start--;
            end++;
        }

        if(end-start > indexes[1] - indexes[0]){
            indexes[0] = start +1;
            indexes[1] = end;
        }


    }

}
