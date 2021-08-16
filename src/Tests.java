import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tests {
    public static void main(String[] args) {

       String[] pew = {"whyy", "pew", "scrub", "whaty", "Jamal"};
        List<String> result = Arrays.stream(pew)
                .map(e -> e+="y")
                .filter(e -> !e.contains("yy"))
                .collect(Collectors.toList());
        System.out.println(result);

    }
}