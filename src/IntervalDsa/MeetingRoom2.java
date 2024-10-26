package IntervalDsa;

import java.util.Arrays;

public class MeetingRoom2 {

    public static void main(String[] args) {

        /**
         * Input: [[0, 30], [5, 10], [15, 20]]
         * Output: 2
         *
         *
         *
         * Asks you to find the minimum number of meeting rooms required to accommodate all the meetings without overlap.
         */

        int[][] arr={{0, 10}, {5, 15}, {10, 20}};


        int[] newArray=arr[0];

        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        int[] startArray=new  int[arr.length];
        int[] endArray=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            startArray[i]=arr[i][0];
            endArray[i]=arr[i][1];
        }
        //[0,5,10]
        //[10,15,20]

        int startPoint=0;
        int endPoint=0;
        int max=0;
        int count=0;
        //O(nlogn)

        while (startPoint<arr.length){
            if(startArray[startPoint]<endArray[endPoint]){
                count++;
                startPoint++;
            }
            else {
                count--;
                endPoint++;
            }
            max=Math.max(count,max);
        }
        System.out.println(count);

    }
}
