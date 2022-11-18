package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo<T> {

    private T t;

    public static void main(String[] args) {
//
//        ArrayList<Integer> list = new ArrayList<>();

        GenericDemo<String> stringGenericDemo = new GenericDemo<>();
        stringGenericDemo.setT("Umesh");
        System.out.println(stringGenericDemo.getT());
        GenericDemo<Integer> obj = new GenericDemo<>();
        obj.setT(1);
        System.out.println(obj.getT());

        List list = new ArrayList<>();
        list.add("obj");
//        list.add(4);
//        list.add(true);

        String s = (String) list.get(0);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
