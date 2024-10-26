package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Recusrion {

    //important

    //https://www.geeksforgeeks.org/top-50-interview-problems-on-recursion-algorithm/

//    Factorial Calculation
//
//    Write a function to compute the factorial of a given number n.
//    Fibonacci Sequence
//
//    Write a function to return the n-th Fibonacci number.
//    Sum of Digits
//
//    Write a function to find the sum of the digits of a given number.
//    String and Array Recursion Problems
//    Reverse a String
//
//    Write a function to reverse a string using recursion.
//            Palindrome Check
//
//    Write a function to check if a given string is a palindrome.
//    String Permutations
//
//    Write a function to generate all permutations of a given string.
//            Power Set
//
//    Write a function to generate all subsets (the power set) of a given set.
//    Advanced Recursion Problems
//    Tower of Hanoi
//
//    Write a function to solve the Tower of Hanoi problem for n disks.
//    N-Queens Problem
//
//    Write a function to solve the N-Queens problem.
//    Sudoku Solver
//
//    Write a function to solve a Sudoku puzzle.

}


//---subStringstring------------------------------------

//    public static void main(String[] args) {
//        // Initialize the intervals array
//        String subs="abcdef";
//        String idx="";
//        printAllSubsequence(subs,idx);
//    }
//
//    private static void printAllSubsequence(String subs, String idx) {
//
//        if (subs.length()==0){
//            System.out.println(idx);
//            return;
//        }
//
//        String str=String.valueOf(subs.charAt(0));
//        String chars=subs.substring(1);
//
//        printAllSubsequence(chars,idx );
//
//        printAllSubsequence(chars,idx+str);
//    }


//--generate all subset & add whose subset is equal to k--------------------

//    int[] nums ={1,2,1};
//    List<List<Integer>> result = new ArrayList<>();
//    int target=2;
//    generateSubsetsHelper(nums, 0, new ArrayList<>(), result,target);
//        for (List<Integer> curr:result){
//        System.out.println(curr);
//        }
//    private static void generateSubsetsHelper(int[] nums, int index, List<Integer> current, List<List<Integer>> result, int target) {
//        // Base case: if we have considered all elements'
//        if (index == nums.length) {
//            // Calculate the sum of the current subset
//            int sum = 0;
//            for (Integer num : current) {
//                sum += num;
//            }
//            // If the sum equals the target, add the current subset to the result
//            if (sum == target) {
//                result.add(current);
//            }
//            return;
//        }
//        // Exclude the current element (recursive call)
//        generateSubsetsHelper(nums, index + 1, new ArrayList<>(current), result, target);
//
//        // Include the current element (recursive call)
//        current.add(nums[index]);
//        generateSubsetsHelper(nums, index + 1, new ArrayList<>(current), result, target);
//    }



//---Fibbonacci
//    private static int fibbonacci(int n) {
//
//        if (n<=1){
//            return n;
//        }
//        return fibbonacci(n-1)+fibbonacci(n-2);
//    }






//--minimum energy to reach end . you can not take more than two step
//private static Integer  findMinEnergy(int length, int[] arr) {
//    if(length==0){
//        return 0;
//    }
//    int firstStep=findMinEnergy(length-1,arr)+ Math.abs(arr[length-1]-arr[length]);
//    int secondStep=99999999;
//    if(length>1){
//        secondStep=findMinEnergy(length-2,arr)+ Math.abs(arr[length-2]-arr[length]);
//    }
//    return Math.min(firstStep,secondStep);
//
//}



//calculate 1 non adjacent
//    private static Integer calculateAdjacentSum(int[] arr, int idx, int sum) {
//        if (arr.length==1){
//            return arr[0];
//        }
//        if (idx>=arr.length){
//            return sum;
//        }
//        int left= calculateAdjacentSum(arr,idx+2,sum+arr[idx]);
//        if(idx==0){
//            idx++;
//        }
//        int right=calculateAdjacentSum(arr,idx+2,sum+arr[idx]);
//
//        sum= Math.max(left,right);
//        return sum;
//    }


//--Any adjacent

//    private static Integer calculateAdjacentSum(int[] arr, int idx ) {
//
//        if (idx==0){
//            return arr[0];
//        }
//        if (idx<0){
//            return 0;
//        }
//        int pick=arr[idx]+calculateAdjacentSum(arr,idx-2);
//        int nonPick=0+calculateAdjacentSum(arr,idx-1);
//
//        return Math.max(pick,nonPick);
//    }







