package LeetCode.MixedTasks;

import java.util.Arrays;

public class T_1528_ShuffleString {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet", arr));
    }



    public static String restoreString(String s, int[] indices) {
        String[] result = new String[indices.length];
        for( int i = 0; i < indices.length; i++){
            result[indices[i]] = s.charAt(i)+"";

        }

        StringBuilder pew = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            pew.append(result[i]);
        }
//        String.join("",result);
        return pew.toString();
    }
}
