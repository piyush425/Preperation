package Recursion.Recursive;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7};

 //       revcursiveArr(arr,0,arr.length-1);
        revcursiveArr(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void revcursiveArr(int[] arr, int i) {
        if (i>arr.length/2){
            return;
        }
         int temp=arr[i];
         arr[i]=arr[arr.length-1-i];
         arr[arr.length-1-i]=temp;

        revcursiveArr(arr,i+1);

    }

//    private static void revcursiveArr(int[] arr, int i, int j) {
//        if (i==j){
//            return;
//        }
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//
//        revcursiveArr(arr,i+1,j-1);
//    }
}
