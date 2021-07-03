import java.util.List;

public class Tests {
    public static void main(String[] args) {
        System.out.println();
        int[] nums = {1, 2, 3, 5, 6, 8, 10, 3, 4};
//                    1  2  x  5  6  8  10  x  4
//                    1  2  5  x  6  8  10  4  x
//
    }
    public static int removeElement(int[] nums, int val) {
        return 3;
    }


    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int m=-1;
        int count=0;
        switch (ruleKey){
            case "type": m=0; break;
            case "color": m=1; break;
            case "name": m=2; break;
        }
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(m).equals(ruleValue)) count++;
        }

        return count;
    }



}
