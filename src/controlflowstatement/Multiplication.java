package controlflowstatement;

public class Multiplication {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        for(int i=0,j=arr2.length-1;i<arr1.length;i++,j--){
           System.out.println(arr1[i]*arr2[j]);
        }
    }
}
