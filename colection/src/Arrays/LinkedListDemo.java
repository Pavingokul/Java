package Arrays;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main (String args[]){
        LinkedList l=new LinkedList();
        l.add(1);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add("Pavin");
        l.add("gokul");
        System.out.println(l);
        l.poll();
        System.out.println(l);
        l.offerFirst(100);
        System.out.println(l);
        l.add(1,101);
        System.out.println(l);
    }
}
