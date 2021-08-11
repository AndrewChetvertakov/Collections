package random_practice;

import java.util.Arrays;

public class SortAlphaNumericSubstrings {
    public static void main(String[] args) {
        SortAlphaNumericSubstrings obj = new SortAlphaNumericSubstrings();
        String a = "DC501GCCCA098911";
//       expected= "CD015ACCCG011899"
        System.out.println(obj.sortSubstring("DC501GCCCA098911"));
//        System.out.println(Arrays.toString(a.toCharArray()));

//          [D, C, 5, 0, 1, G, C, C, C, A, 0, 9, 8, 9, 1, 1]

    }


    public String sortSubstring(String str){
        char[] c = str.toCharArray();
        int[] indexes = {0,0};
        boolean digit = false;


        for (int i = 0; i < c.length; i++) {

            if(Character.isDigit(c[i])){digit = true;}

        }




        return new String("");
    }
}
