package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * stream api = it is sequence of object and it have many methods
 *              we combine that method and produce desire result
 *
 * types - sequential and parallel stream(multithreading)
 *
 * operation - intermediate and terminal
 *
 * terminal - forEach(),reduce(),collect()
 * intermediate - map(Function),filter(Predicate),sorted()
 *
 */
public class StreamApi {
    public static void main(String[] args) {

        Function<Integer, Integer> fun = (integer) -> integer * integer;

//        System.out.println(fun.apply(9));

        Function<String, Integer> str = (st) -> st.length();
//        System.out.println(str.apply("welcome"));


        List<Integer> list = Arrays.asList(1,2,3,45,6);

        int max =0;

        for (int i=0;i<list.size();i++){

            if(list.get(i)>max){
                max = list.get(i);
            }
        }

        System.out.println("max-->"+max);
        System.out.println(IntStream.of(1, 2, 3, 4, 5, 6, 7).max().getAsInt());
        System.out.println(Arrays.toString(IntStream.range(1, 100).toArray()));
        System.out.println(IntStream.range(1,11).sum());
//        Predicate<Integer> max = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer > 5;
//            }
//        };
//
//        list.stream().filter(max).forEach(System.out::println);


    }
}
