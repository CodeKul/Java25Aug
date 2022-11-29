package java8;

import java.util.function.Function;

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

        Function<Integer,Integer> fun = (integer)-> integer*integer;

        System.out.println(fun.apply(9));

        Function<String,Integer> str = (st)->st.length();
        System.out.println(str.apply("welcome"));


    }
}
