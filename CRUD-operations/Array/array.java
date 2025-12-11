import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // System.out.println("Enter array Size:");
        // int n = s.nextInt();
        // int[] arr = new int[n];
        // for(int i = 0; i < n; i++){
        //     arr[i] = s.nextInt();
        // }

        int arr[] = {1,2,3,4,5};

        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]+" ");
        // }

        for (int i : arr) {
            System.out.print(i+" ");
        }

        arr[0] = 0;
        arr[1] = arr[0]+1;
        arr[2] = arr[1]+1;


        // delete - operation consider 0 as non existing or deleted element 
        //soft - shift
        arr[0] = 0;

        //hard - shift
        // remove 3 rd index element;

        int[] newarr = new int[arr.length-1];
        int j = 0;
        for(int i = 0; i < arr.length;i++){
            if(i != 3){
                newarr[j] = arr[i];
                j++;
            }
        }
        arr = newarr;
        printArr(arr);
    }
    public static void printArr(int[] arr){
        for (int i : arr) {
            System.out.println(i+" ");
        }
    }
}
