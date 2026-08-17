package Arrays;

import java.util.*;
import java.util.Iterator;

public class HashMapMethods {
    public static void main (String args[]){
        HashMap h=new HashMap();
        h.put("Idli",10);
        h.put("Dosa",20);
        h.put("PlainDosa",20);
        h.put("Poori",25);
        h.put("Pongal",40);
        System.out.println("EntrySet :"+h.entrySet());
        System.out.println("Key :"+h.keySet());
        System.out.println("Values :"+h.values());
        System.out.println(h.get("Idli"));
        System.out.println(h.containsKey("Dosa"));
        System.out.println(h.containsValue(10));
        LinkedHashMap h2=new LinkedHashMap();
        h2.putAll(h);
        LinkedHashSet s= (new LinkedHashSet(h2.entrySet()));
        Iterator i=s.iterator();
        while(i.hasNext()){
            Object o=i.next();
            Map.Entry m=(Map.Entry)o;
            System.out.println(m.getKey());
            System.out.println(m.getValue());
            if(m.getValue().equals(20)){
                System.out.println(m.getKey());
            }
        }

    }
}
