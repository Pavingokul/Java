package Arrays;

import java.util.*;

import static java.util.Arrays.sort;

public class HashSetDemo {
    public static void main(String args[]) {
        HashSet h=new HashSet();
        h.add(31);
        h.add(166);
        h.add(12);
        h.add(10);
        boolean i=h.contains(10);
        System.out.println(h);
        System.out.println(i);
    }
}
