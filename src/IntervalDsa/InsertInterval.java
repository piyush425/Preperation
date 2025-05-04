package IntervalDsa;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {

        /**
         * https://leetcode.com/problems/insert-interval/
         *
         * {{2,4},{3,6},{9,11}}
         * {1,12}
         *
         * {1,12}         */

        int[][] arr={{2,4},{3,6},{9,11}};
        int[] newArr={5,12};
        List<int[]> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i][1]<newArr[0]){
                list.add(arr[i]);
            }
            else if(newArr[1]<arr[i][0]){
                list.add(newArr);
                newArr=arr[i];
            }
            else{
                newArr[0]=Math.min(arr[i][0],newArr[0]);
                newArr[1]=Math.max(arr[i][1],newArr[1]);
            }
        }
        list.add(newArr);
    }
}
