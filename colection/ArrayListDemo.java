package Arrays;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main (String [] args){
        ArrayList l= new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add("Pavin");
        l.add(5);
        System.out.println(l);
        System.out.println(l.contains(5));
        System.out.println(l.get(5));
        System.out.println(l.remove(5));
        System.out.println(l.set(4,"G"));
        System.out.println(l);
        ArrayList l1=new ArrayList();
        l1.addAll(l);
        System.out.println(l1);
        System.out.println(l1.subList(0,4));
    }
}
