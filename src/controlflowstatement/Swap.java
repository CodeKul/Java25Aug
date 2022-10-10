package controlflowstatement;

public class Swap {
    public static void main(String[] args) {

        int a=10,b=20;
        int temp;
        temp = a;
        a= b;
        b= temp;
        System.out.println(a+" "+b);
    }
}
