package LeetCode.medium_difficulty.random_medium_tasks;

import java.util.*;
import java.util.stream.Collectors;

public class T_2225_Find_Players_With_Zero_or_One_Losses {
//    https://leetcode.com/problems/find-players-with-zero-or-one-losses/
    public static void main(String[] args) {
        T_2225_Find_Players_With_Zero_or_One_Losses obj = new T_2225_Find_Players_With_Zero_or_One_Losses();

        int[][] input = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        System.out.printf("Expected = %s\n", "[[1,2,10],[4,5,7,8]]");
        System.out.println(obj.findWinners(input));

    }

    private List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> scores = new HashMap<>();
        for(int[] match : matches) {
            scores.put(match[1], scores.getOrDefault(match[1] , 0) + 1);
            scores.put(match[0], scores.getOrDefault(match[0] , 0));
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> won_all = new ArrayList<>();
        List<Integer> lost_one = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : scores.entrySet()) {
            int losses = entry.getValue();
            if(losses == 0) won_all.add(entry.getKey());
            if(losses == 1) lost_one.add(entry.getKey());
        }
        Collections.sort(won_all);
        Collections.sort(lost_one);
        result.add(won_all);
        result.add(lost_one);
        return result;
    }
    // To review. Same speed as var1, but this one got .merge - wtf? :D
    private List<List<Integer>> findWinners_var2(int[][] matches) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> winners = new HashMap<>(matches.length);
        HashMap<Integer, Integer> oneLossers = new HashMap<>(matches.length);

        for (int[] match : matches) {
            for (int j = 0; j < 1; j++) {
                winners.put(match[0], 1);
                oneLossers.merge(match[1], 1, Integer::sum);
            }
        }
        winners.keySet().removeAll(oneLossers.keySet());
        result.add(
                winners.keySet()
                .stream()
                .sorted()
                .collect(Collectors.toList())
        );
        result.add(
                oneLossers.entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList())
        );
        return result;
    }
}
