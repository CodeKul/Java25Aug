package java8;

public class MethodRefConstructor {

    MethodRefConstructor(){
        System.out.println("In const");
    }
    public static void main(String[] args) {

        MyInterface5 myInterface5 = MethodRefConstructor::new;
        myInterface5.getConst();
    }
}

interface MyInterface5{

    MethodRefConstructor getConst();
}