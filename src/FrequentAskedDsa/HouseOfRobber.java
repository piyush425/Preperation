package FrequentAskedDsa;

public class HouseOfRobber {

    public static void main(String[] args) {
        /**
         * 2,7,9,3,1
         *
         * 2 7 11 11  12
         *
         * dp[i]=dp[i-3]+nums[i],dp[i-2]+nums[i]kj,dp[i-1];
         *
         *
         */

    }
    public int rob(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }


        int[] dp=new int[nums.length];

        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[nums.length-1];

    }
}
