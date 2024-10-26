package twoPointer;

public class MinimumSubArray {
    public static void main(String[] args) {

        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        int i=0;
        int j=1;
        int min=999999;
        int sum=nums[0];
//        if(sum==target){
//            return 1;
//        }


        while (i<j && j<nums.length){
            if(sum>=target){
                min=Math.min(j-i+1,min);
                sum-=nums[i];
                i++;
            }
            else {
                j++;
                if(j<nums.length){
                    sum+=nums[j];
                }
            }
        }
//        return min;


    }
}
