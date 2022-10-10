package controlflowstatement;

public class Sort {
    public static void main(String[] args) {

        int[] arr = {1,223,44,6,33,22};
        int temp;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
