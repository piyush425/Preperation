package Array;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};

        int[] result=new int[nums.length];

        for (int i=0;i<nums.length;i++){
            result[i]=1;
        }

        int prefix=1;

        for (int i=0;i<nums.length;i++){
            result[i]=prefix;
            prefix*=nums[i];
        }

        int suffix=1;

        for(int j=nums.length-1;j>=0;j--){
            result[j]*=suffix;
            suffix*=nums[j];
        }
        System.out.println(Arrays.toString(result));
    }
}
