package java8;

public class MethodRefStatic {
    public static void main(String[] args) {
        //method ref to static method
        MyInterface4 myInterface4 = MethodRefStatic::display;//refer
        myInterface4.show();//call
    }
    public static void display(){
        System.out.println("In display");
    }
}

interface MyInterface4{

    void show();
}