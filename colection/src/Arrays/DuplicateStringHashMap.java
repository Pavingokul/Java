package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SuplicateStringHashMap {
    public static void main (String args[]){
        String s="Pavingokull";
        HashMap<Character, Integer> h=new HashMap();
        char c[]=s.toCharArray();
        for(char c1:c){
            if(h.containsKey(c1)){
                h.put(c1,h.get(c1)+1);
            }else
                h.put(c1,1);
        }
        System.out.println(h);
        Set<Map.Entry<Character,Integer>> se=h.entrySet();
        for(Map.Entry<Character,Integer>entry:se){
            if(entry.getValue()>1)
                System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }
}
