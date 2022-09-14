package abstraction.interfacedemo;

public class Addition implements Add,Sub {

    @Override
    public int add(int i, int j) {//implementation of method
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i/j);
        System.out.println(i%j);
        return 0;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }


    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add(4,6);
        obj.sub(9,8);
    }

    @Override
    public int substract(int i, int b) {
        return i-b;
    }
}
