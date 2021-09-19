import java.util.Arrays;

public class ASHJASDHJKDAS {
    public static void main(String[] args) {
        String anythign = "ashjdahskjdhakudfhajksdhajkshdajkhsdaszzzzzz";
        int[] alphabet = new int[26];
        for(char c: anythign.toCharArray()){
    // a - 97 = index 0
//     b - 92 = index 1
//            ....
//     z - 97 = index 26
            alphabet[c-97]++;
        }
        System.out.print(" ");
        for (int i = 'a'; i<='z'; i++){
            System.out.print(((char)i) + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(alphabet));
    }
}
