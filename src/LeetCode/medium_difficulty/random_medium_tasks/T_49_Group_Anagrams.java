package LeetCode.medium_difficulty.random_medium_tasks;

import java.util.*;

public class T_49_Group_Anagrams {
    // https://leetcode.com/problems/group-anagrams/
    public static void main(String[] args) {
        T_49_Group_Anagrams obj = new T_49_Group_Anagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = new ArrayList<>() {{
            add(new ArrayList<>(List.of("bat")));
            add(new ArrayList<>(Arrays.asList("nat", "tan")));
            add(new ArrayList<>(Arrays.asList("ate", "eat", "tea")));
        }};

        System.out.printf("Input = %s\nResult = %s\nExpected = %s\n",
                Arrays.toString(input),
                obj.groupAnagrams(input),
                expected
        );

    }

    //speed 55%
    private List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if (!map.containsKey(key)) {
                List<String> new_anagram_group = new ArrayList<>();
                new_anagram_group.add(s);
                map.put(key, new_anagram_group);
            } else {
                map.get(key).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }

    // speed 99%
    private List<List<String>> groupAnagrams_var2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(strs.length);
        char[] alphabet = new char[26];
        for (String str : strs) {
            Arrays.fill(alphabet, '0');
            for (char c : str.toCharArray()) alphabet[c - 'a']++;
            String key = new String(alphabet);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
