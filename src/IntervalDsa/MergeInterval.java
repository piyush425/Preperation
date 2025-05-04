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

        int[]  newArr=arr[0];
        List<int[]> list=new ArrayList<>();



        for(int i=1;i<arr.length;i++){
            if(newArr[1]<arr[i][0]){
                list.add(newArr);
                newArr=arr[i];
            }
            else if(arr[i][1]<newArr[0]){
                list.add(arr[i]);
            }
            else {
                newArr[0]=Math.min(newArr[0],arr[i][0]);
                newArr[1]=Math.max(newArr[1],arr[i][1]);

                /**
                 * 🔹 This merges two overlapping intervals:
                 *
                 * [1, 5] and [2, 6] → [1, 6]
                 *
                 * [2, 4] and [3, 5] → [2, 5]
                 */
            }

        }
        list.add(newArr);
        list.forEach(lst->System.out.println(Arrays.toString(lst)));
    }
}
