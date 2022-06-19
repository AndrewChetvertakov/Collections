package LeetCode.MixedTasks;

public class T_383_Ransom_Note {
//    https://leetcode.com/problems/ransom-note/
    private boolean canConstruct(String ransomNote, String magazine) {
        int[] note = new int[26];
        int[] mag = new int[26];
        for(char c : ransomNote.toCharArray()) note[c-97]++;
        for(char c : magazine.toCharArray()) mag[c-97]++;
        for(int i=0; i<26; i++)
            if(note[i] > mag[i]) return false;
        return true;
    }
}
