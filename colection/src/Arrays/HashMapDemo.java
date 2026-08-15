package Arrays;

import java.util.*;

public class HashMapDemo {
    public static void main(String []args){
        HashMap h=new HashMap();
        h.put(100,"Pavin");
        h.put(101,"Gokul");
        h.put(102,"Praba");
        h.put(103,"Praba");
        System.out.println(h);
        System.out.println(h.keySet());
        System.out.println(h.values());
        Collection j = h.entrySet();
        System.out.println(j);
        Iterator i=j.iterator();
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            if(me.getKey().equals(103)){
                me.setValue("kalai");
                System.out.println(me.getKey()+" "+ me.getValue() );
                System.out.println(me);
        }}
        System.out.println(h);
    }
}
