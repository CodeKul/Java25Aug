package controlflowstatement;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        System.out.println("In main");

        int num = (int) (Math.random()*100)+1;
        int guessNumber = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the number");
            guessNumber = scanner.nextInt();

            if(num>guessNumber){
                System.out.println("Number is greater");
            }else if(num<guessNumber){
                System.out.println("number is less");
            }else {
                System.out.println("You guess correct");
            }
        }while (num != guessNumber);
    }



}
