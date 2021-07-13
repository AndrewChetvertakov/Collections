package LeetCode.medium_String_tasks;

public class LongestPalindromicSubstringGG {
    public static void main(String[] args) {
        String str = "noonllpewcivic";
        System.out.println(returnLongestPalindrome(str));
    }

    public static String returnLongestPalindrome(String str) {
        char[] input = str.toCharArray();
        int[] indexes = new int[2];

        for (int i = 0; i < input.length; i++) {
            checkPalindrome(input, indexes, i, i);   // odd
            checkPalindrome(input, indexes, i, i+1); //even
        }
        return str.substring(indexes[0], indexes[1]);
    }

    public static void checkPalindrome(char[] input, int[] indexes, int start, int end){
        while(start >= 0 && end <= input.length -1){
            if(input[start] != input[end]){break;}
            start--;
            end++;
            //     level  <-5
            //     01234
            //     noon  <-4
            //     0123
        }
        if(end - start > indexes[1] - indexes[0]){
            indexes[1] = end;
            indexes[0] = start+1;
        }
    }
}
