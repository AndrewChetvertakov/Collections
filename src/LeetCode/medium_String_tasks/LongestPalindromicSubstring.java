package LeetCode.medium_String_tasks;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {

        System.out.println(longestPalindrome("babad"));


    }








    public static String longestPalindrome(String s) {
        if (s.length() == 1) return s;

        int[] substr_indices = new int[2];

        for (int i = 0; i < s.length(); i++) {
            // ODD SUBSTRINGS
            update_substring_indices(s, substr_indices, i, i);
            // EVEN SUBSTRINGS
            update_substring_indices(s, substr_indices, i, i+1);
        }

        return s.substring(substr_indices[0], substr_indices[1]);
    }
    private static void update_substring_indices(String s, int[] substr_indices, int left, int right) {
        int sLen = s.length();
        int oldLeft = substr_indices[0];
        int oldRight = substr_indices[1];
        while (left >= 0 && right <= sLen-1) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        // RECALL: window size is different since we STOP AT the violating chars
        if (right-left-1 > oldRight-oldLeft-1) {
            // RECALL: left+1 to account for violation
            substr_indices[0] = left+1;
            substr_indices[1] = right;
        }
    }


}
