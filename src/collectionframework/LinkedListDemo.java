package collectionframework;

// LinkedList store duplicate value
//LinkedList maintain insertion order
//LinkedList uses doubly linked list to store the element
//

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
    }
}
