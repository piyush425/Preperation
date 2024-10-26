package Recursion.Backtracking;

public class LinearPrint {
    public static void main(String[] args) {
        //print 1 2 3 4
        //where n=4;

        int n=4;

        // forward print 1 2 3 4
        linearRecursion(1,n);// this we print using recursion
        linearBackTracking(n,n);// this we print using backtracking

        //backward print 4 3 2 1
        backwardPrintRecursion(n,n); // this we print backward number using recursion
        backwardPrintBacktracking(1,n); // this we print backward number using backtracking
    }

    private static void backwardPrintBacktracking(int i, int n) {
        if(i>n){
           return;
        }
        backwardPrintBacktracking(i+1,n);
        System.out.println(i);
    }

    private static void backwardPrintRecursion(int i, int n) {
        if(i<1){
            return;
        }
        System.out.println(i);
        backwardPrintRecursion(i-1,n);
    }

    private static void linearRecursion(int i, int n) {
        if(i>n){
            return;
        }
        System.out.println(i);
        linearRecursion(i+1,n);
    }

    private static void linearBackTracking(int i, int n) {

        if(i<1){
            return;
        }
        linearBackTracking(i-1,n);
        System.out.println(i);
    }


}
