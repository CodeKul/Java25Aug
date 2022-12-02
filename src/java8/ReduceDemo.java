package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Optional<Integer> in =list.stream().reduce((a, b)->a+b);
        System.out.println(in.get());

        Optional<Integer> i = list.stream().reduce((a,b)->(a>b)?a:b);
        System.out.println(i.get());

        List<String> list1 = Arrays.asList("Rahul","Mahesh","Abhishek","John");
        Optional<String> optional = list1.stream().reduce((a,b)->(a.length()<b.length())?a:b);
        System.out.println(optional.get());
    }

}
