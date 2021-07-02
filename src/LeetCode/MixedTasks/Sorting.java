package LeetCode.MixedTasks;

public class Sorting {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] result = new String[arr.length];
        String finalResult;
        for( int i = 0; i < arr.length; i++){
            int index = Integer.parseInt(arr[i].substring(arr[i].length()-1));

            result[index-1] = arr[i].substring(0 ,arr[i].length()-1);


        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < result.length; i++){

            builder.append(result[i]).append(" ");
        }
        return builder.toString().trim();
    }
}
