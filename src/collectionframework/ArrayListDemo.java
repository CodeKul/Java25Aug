package collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        list.forEach(integer-> System.out.println(integer));


    }
}
