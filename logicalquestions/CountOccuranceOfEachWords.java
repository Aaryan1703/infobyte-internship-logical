package logicalquestions;

import java.util.HashMap;

public class CountOccuranceOfEachWords {
    public static void main(String[] args) {
        String str="Test automation java automation";

        HashMap<String,Integer>countHashMap=new HashMap<>();
        for (String s:str.split(" ")){
            if(countHashMap.containsKey(s)){
                countHashMap.put(s,countHashMap.get(s)+1);
            }else {
                countHashMap.put(s,1);
            }
        }
        System.out.println(countHashMap);
    }
}
