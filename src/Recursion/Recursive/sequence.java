package Recursion.Recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class sequence {

    public static void main(String[] args) {

        int[] arr={1,2,3,4};
        int k=5;

    //    sequencePrint(0,arr,new ArrayList<>(),k);

        //without print all subsequences
//        modifySequences(0,arr,new ArrayList<>(),k,0);
        modifySequences(0,arr,new ArrayList<>(),k,0);

        // count all subsequences
        int count=countSubsequenncesEqualToK(0,arr,0,k);
        System.out.println(count);

    }

    private static Integer countSubsequenncesEqualToK(int i, int[] arr, int sum,int k) {

        if(i==arr.length){
            if (sum==k){
                return 1;
            }
            else{
                return 0;
            }
        }
        sum+=arr[i];
        int a=countSubsequenncesEqualToK(i+1,arr,sum,k);

        sum-=arr[i];
        int b=countSubsequenncesEqualToK(i+1,arr,sum,k);

        return a+b;

    }


    private static boolean modifySequences(int i, int[] arr, ArrayList<Integer> list, int k, int sum) {

        if(i==arr.length){
            if(sum==k){
                System.out.println(list);
                return true;
            }
            return false;
        }

        list.add(arr[i]);
        sum+=arr[i];
        if(modifySequences(i+1,arr,list,k,sum)==true){
            return true;
        };
        list.remove(list.size()-1);
        sum-=arr[i];
        if (modifySequences(i+1,arr,list,k,sum)==true){
            return true;
        };
        return false;
    }



//    private static void modifySequences(int i, int[] arr, ArrayList<Integer> list, int k, int sum) {
//
//        if(i>=arr.length){
//            if(sum==k){
//                System.out.println(list);
//            }
//            return;
//        }
//
//        list.add(arr[i]);
//        sum+=arr[i];
//        modifySequences(i+1,arr,list,k,sum);
//        list.remove(list.size()-1);
//        sum-=arr[i];
//        modifySequences(i+1,arr,list,k,sum);
//    }


    private static void sequencePrint(int i, int[] arr, ArrayList<Integer> list ,int k) {

        if (i>=arr.length){
            if (sum(list)==k){
                System.out.println(list);
            }
            return;
        }

        list.add(arr[i]);
        sequencePrint(i+1,arr,list,k);
        list.remove(list.size()-1);
        sequencePrint(i+1,arr,list,k);
    }

    private static Integer  sum(List<Integer> list){
        int summ=0;
        for (int s: list){
            summ+=s;
        }
        return summ;

    }
}
