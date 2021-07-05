import java.util.List;

public class Tests {
    public static void main(String[] args) {
    String a = "abcdefghijklmnopqrstuvwxyz";
    for(char c: a.toCharArray())
        System.out.println("char " + c + " " + Character.getNumericValue(c));


//    char b = 'a';
//        System.out.println("value = " + converter(a));

    }
    public int converter(String word){
        int i=0;
        for(char c: word.toCharArray()){
            i= i*10 + (Character.getNumericValue(c)-97);
        }
        return i;
    }


}
