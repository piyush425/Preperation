package Array;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreaseSubsequence {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,2,3};

        List<Integer> list=new ArrayList<>();
        list.add(nums[0]);

        for (int i=1;i<nums.length;i++){
            if (list.get(list.size()-1)<nums[i]){
                list.add(nums[i]);
            }
            else {
                list=adjustElement(list,nums[i]);
            }
        }
        System.out.println(list.size());

    }

    private static List<Integer> adjustElement(List<Integer> list, int num) {
            int i = 0;
            int j = list.size();


            while (i < j) {
                int mid = i + (j - i) / 2;
                if (list.get(mid) < num) {
                    i = mid + 1;
                } else {
                    j = mid;
                }
            }

            list.set(i, num);
            return list;

    }
}
