package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(41, 234, 3, 344, 5, 6);
        List<Integer> ne = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }
}
