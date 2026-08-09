package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class DemoArrays implements Comparator {
    public static void main(String args[]) {
//        int arr[]={1,22,3,4,5};
//        Arrays.sort(arr);
//        for(int a:arr){
//        System.out.print(a+" ");
//    }
        String[] names = {"Pavin", "Gokul", "Prabakaran", "Jagan"};

        System.out.println("Before ");
        for (String a : names) {
            System.out.println(a);
        }
        Comparator comp = new DemoArrays();
        Arrays.sort(names, comp);
        System.out.println();
        for (String a : names) {
            System.out.println(a);
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        String s1=(String)o1;
        String s2=o2.toString();
        int result=s1.compareTo(s2);
        if(result>0)
            return -1;
        else if (result<0)
            return +1;
        else
            return 0;

//        if(s1.length()>s2.length())
//            return +1;
//        else if (s1.length()<s2.length()) {
//            return -1;
//        }
//        else
//            return 0;

    }
}
