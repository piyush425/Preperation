//public class DP {
//
//    //important
//    //https://www.geeksforgeeks.org/top-20-dynamic-programming-interview-questions/
//
//
//
//
//
//    //DP FIBONACCI MEMOISATION
//
////    int[] memo=new int[n+1];
////        System.out.println(fibbonacci(n,memo));
////}
////
////    private static int fibbonacci(int n, int[] memo) {
////
////        if (n<=1){
////            return n;
////        }
////        if(memo[n]!=0){
////            return memo[n];
////        }
////        return memo[n]=fibbonacci(n-1, memo)+fibbonacci(n-2, memo);
//}
//
//
////**************************************CheckSubsetEqualToTarget********************************************
//
////    public static void main(String[] args) {
////        int[] arr={3,2,4,2};
////        int target=3;
////        boolean[][] dp=new boolean[arr.length][target+1];
////        for (int i = 0; i < arr.length; i++) {
////            for (int j = 0; j < target; j++) {
////                dp[i][j] = false;
////            }
////        }
////        boolean flag=checkSubsetEqualTarget(arr.length-1,arr,target,dp);
////        System.out.println(flag);
////
////    }
////
////    private static boolean checkSubsetEqualTarget(int i, int[] arr, int target, boolean[][] dp) {
////        if (i==0){
////            return arr[0]==target;
////        }
////        if(target==0){
////            return true;
////        }
////        if (dp[i][target]!=false){
////            return dp[i][target];
////        }
////        boolean notPick=checkSubsetEqualTarget(i-1,arr,target, dp);
////        boolean pick=false;
////        if(arr[i]<=target){
////            pick=checkSubsetEqualTarget(i-1,arr,target-arr[i], dp);
////        }
////        dp[i][target]=pick||notPick;
////        return dp[i][target];
////    }
//
////    public static void main(String[] args) {
////        int[] arr = {8, 1, 3, 4};
////        int target = 10;
////        boolean[][] dp = new boolean[arr.length+1][target + 1];
////
////        for (int i=0;i<dp.length;i++){
////            for(int j=0;j<dp[0].length;j++){
////                if(j==0 && i==0){
////                    dp[i][j]=true;
////                }
////                else if(j==0){
////                    dp[i][j]=true;
////                }
////                else if (i==0){
////                    dp[i][j]=false;
////                }
////                else{
////                    //not  batting
////                    if(dp[i-1][j]==true){
////                        dp[i][j]=true;
////                    }
////                    else{
////                        //batting
////                        int val=arr[i-1];
////                        if (j>=val){
////                            if(dp[i-1][j-val]==true){
////                                dp[i][j]=true;
////                            }
////                        }
////                    }
////
////                }
////            }
////        }
////        // The answer is in the last cell
////        System.out.println(dp[arr.length][target]);
////    }
//
//
//
////*************** combination of sum ***********************
////int[] arr = {2, 3, 2,7};
////    int target = 7;
////    int[] dp = new int[target + 1];
////        dp[0] = 1;
////                for (int i = 0; i < arr.length; i++) {
////        for (int j = arr[i]; j < dp.length; j++) {
////        dp[j] += dp[j - arr[i]];
////        }
////        }
////        System.out.println(dp[target]);
//
//
////****************** permutation of sum *********************//    int[] arr = {2, 3, 5};
////    int target = 7;
////    int[] dp = new int[target + 1];
////        dp[0] = 1;
////                for(int i=1;i<dp.length;i++){
////        for (int j=0;j<arr.length;j++){
////        if(arr[j]<=i){
////        int var=i-arr[j];
////        dp[i]+=dp[var];
////        }
////        }
////        }
////        System.out.println(dp[target]);
//
//
