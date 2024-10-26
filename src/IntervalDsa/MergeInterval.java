package IntervalDsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval{
    public static void main(String[] args) {

        /**
         * arr=[[1,3],[2,6],[8,10],[15,18]]
         *
         * Result=[[1,6],[8,10],[15,18]]
         */

        int[][] arr={{1,3},{2,6},{8,10},{15,18}};

        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        int[] newArray=new int[2];
        newArray=arr[0];

        List<int[]> list=new ArrayList<>();

        for (int i=1;i<arr.length;i++){
            if (arr[i][1]<newArray[0]){
                list.add(arr[i]);
            }
            else if(newArray[1]<arr[i][0]){
                list.add(newArray);
                newArray=arr[i];
            }
            else{
                newArray[0]=Math.min(arr[i][0],newArray[0]);
                newArray[1]=Math.max(arr[i][1],newArray[1]);
            }
        }
        list.add(newArray);

        for (int[] s: list){
            System.out.println(Arrays.toString(s));
        }
    }
}
