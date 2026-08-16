package Arrays;

import java.util.HashMap;

public class StringHashMApDemo {
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
    }

}
