package Arrays;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main (String args[]){
        TreeMap t =new TreeMap();
        t.put(100,"pavin");
        t.put(102,"gan");
        t.put(101,"gokul");
        System.out.println(t);
        System.out.println(t.keySet());
        System.out.println(t.values());
        System.out.println(t.firstEntry());
    }
}
