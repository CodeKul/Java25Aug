package controlflowstatement;
import java.util.Scanner;

public class ArrayQ1 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner scanner = new Scanner(System.in);
        for (int i=0;i< arr.length;i++){
            System.out.println("Enter the value");
            arr[i] = scanner.nextInt();
        }

        String operation;
        System.out.println("enter operation - reverse,duplicate,evenOdd");
        operation = scanner.next();

        switch (operation){
            case "duplicate":
                duplicate(arr);
                break;
            case "reverse":
                reverse(arr);
                break;
            case "evenOdd":
                evenOdd(arr);
                break;
            default:
                System.out.println("wrong choice");
        }
    }

    private static void duplicate(int[] arr){
        for (int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    private static void reverse(int[] arr){

    }

    private static void evenOdd(int[] arr){

    }
}
