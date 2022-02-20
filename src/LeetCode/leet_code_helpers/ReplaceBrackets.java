package LeetCode.leet_code_helpers;

public class ReplaceBrackets {
    public static void main(String[] args) {
        ReplaceBrackets obj = new ReplaceBrackets();
        String[] input = {"[[1,3],[2,2],[3,1]]"

                                                 };
        System.out.println(obj.replacer(input[0]));

    }

    private String replacer(String input){
        return input.replace("[", "{").replace("]", "}");
    }

}
