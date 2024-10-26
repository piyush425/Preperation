package twoPointer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};

        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){continue;} //IMPORTANT EDGECASE
            int j=i+1;
            int k=nums.length-1;

            while (j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> finals=new ArrayList<>();
                    finals.add(nums[i]);
                    finals.add(nums[j]);
                    finals.add(nums[k]);
                    list.add(finals);
                    while(j<k && nums[j]==nums[j+1]){j++;} //IMPORTANT EDGECASE
                    while(j<k && nums[k]==nums[k-1]){k--;} //IMPORTANT EDGECASE
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        System.out.println(list);
    }

}
