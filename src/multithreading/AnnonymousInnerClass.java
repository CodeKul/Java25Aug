package multithreading;

public class AnnonymousInnerClass {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void show() {
                System.out.println("in show");
            }

            @Override
            public int add(int i, int j) {
                return i+j;
            }
        };
        myInterface.show();
        myInterface.add(8,9);
    }
}

interface MyInterface{
    void show();

    int add(int i,int j);

}