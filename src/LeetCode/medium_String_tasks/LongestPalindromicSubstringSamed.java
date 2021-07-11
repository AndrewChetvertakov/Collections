package LeetCode.medium_String_tasks;

public class LongestPalindromicSubstringSamed {
    public static void main(String[] args) {

    String word = "hdhjshasaasahrjfjuf1huk";
    String result = "";
    int count = 0;
    boolean checkPalindrome = false;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                String temp = "";
                if (j != word.length() - 1) {
                    if (word.charAt(i) == word.charAt(j)) {
                        temp = word.substring(i, j + 1);
                        checkPalindrome = isPalindrome(temp);
                    }
                } else {
                    temp = word.substring(i);
                    checkPalindrome = isPalindrome(temp);
                }
                if (checkPalindrome && count < temp.length()) {
                    result = word.substring(i, j + 1);
                    count = result.length();
                }
            }
        }

        System.out.println("result = " + result);
}

    public static boolean isPalindrome(String s) {
        for(int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}


