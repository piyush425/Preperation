package IntervalDsa;

import java.util.Arrays;

public class NonOverLapping {

    /**
     * Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
     * Output: 1
     * Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
     */
    public static void main(String[] args) {

        int[][] arr={{1,11},{2,12},{11,22},{1,100}};

        //{1,2},{1,3},{2,3}

        Arrays.sort(arr,(a,b)->a[1]-b[1]);

        int[] newArray=arr[0];
        int count=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<newArray[1]){
                count++;
            }
            else {
                newArray=arr[i];
            }
        }
        System.out.println(count);
    }
}
