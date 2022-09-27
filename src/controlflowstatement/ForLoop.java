package controlflowstatement;

public class ForLoop {

    public static void main(String[] args) {

        int[] arr = new int[4];
        arr[0] =10;
        arr[1] =40;
        arr[2] =33;
        arr[3] =23;

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
}
