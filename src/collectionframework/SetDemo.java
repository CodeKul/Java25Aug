package collectionframework;

import java.util.*;

//set doesnt maintain the insertion order
//set doesnt store the sduplicate values
//
public class SetDemo {
    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(30);
        set.add(40);
        System.out.println(set);
        System.out.println(set.contains(10));

        Integer[] arr=  set.toArray(new Integer[10]);


    }
}
