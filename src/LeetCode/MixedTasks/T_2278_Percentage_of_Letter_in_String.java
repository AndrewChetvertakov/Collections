package LeetCode.MixedTasks;

public class T_2278_Percentage_of_Letter_in_String {
    // https://leetcode.com/problems/percentage-of-letter-in-string/
    public static void main(String[] args) {
        T_2278_Percentage_of_Letter_in_String obj = new T_2278_Percentage_of_Letter_in_String();
        String input = "foobar";
        char c = 'o';
        System.out.printf("Expected = 33\nActual   = %d", obj.percentageLetter(input, c));
    }

    private int percentageLetter(String s, char letter) {
        int len = s.length(), count = 0;
        for(char c : s.toCharArray()) if(c == letter) count++;
        return count*100/len;
    }
}
