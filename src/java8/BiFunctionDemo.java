package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionDemo {

    public static void main(String[] args) {

        BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> even = (l, p) -> {
            List<Integer> arr = new ArrayList<>();
            for (Integer i : l) {
                if (p.test(i)) {
                    arr.add(i);
                }
            }
            return arr;
        };
        even.apply(Arrays.asList(1, 2, 3, 4, 5, 6), (p) -> p % 2 == 0).forEach(System.out::println);
    }
}
