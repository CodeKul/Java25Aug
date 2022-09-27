package controlflowstatement;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int i = scanner.nextInt();

        if(i>0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }

        String str = i>0?"Number is positive":"Number is negative";

        int a=1012,b=206,c=30;
        if(a>b&& a>c){
            System.out.println("a is greater");
        }else if(b>c){
            System.out.println("b is greater");
        }else {
            System.out.println("c is greater");
        }

        int x=90,y=60,z=45;

        if(x+y+z==180){
            System.out.println("triangle");
            if(x==90 || y ==90 || z==90){
                System.out.println("right angle triangle");
            }else {
                System.out.println("Not right angle triangle");
            }
        }else {
            System.out.println("it is not triangle");
        }


    }
}
