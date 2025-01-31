import java.util.HashMap;
import java.util.Map;

public class DuplicateCharterInString {
    public static void main(String[] args) {
        String str="Programming";

        Map<Character,Integer>charCount=new HashMap<>();

        for (char c:str.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);

            for (Map.Entry<Character,Integer>entry: charCount.entrySet()){
                if(entry.getValue()>1) {
                    System.out.println(entry.getKey() + " >> " + entry.getValue());
                }
            }
        }
    }
}
