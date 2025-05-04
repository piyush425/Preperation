package IntervalDsa;

import java.util.Arrays;

public class MeetingRoom2 {

    public static void main(String[] args) {

        /**
         * Input: [[0, 30], [5, 10], [15, 20]]
         * Output: 2
         * Asks you to find the minimum number of meeting rooms required to accommodate all the meetings without overlap.
         */

        int[][] arr={{0, 30}, {5, 10}, {15, 20}};

        int n=arr.length;

        int[] startArr=new int[n];
        int[] endArr=new int[n];


        for (int i=0;i<arr.length;i++){
            startArr[i]=arr[i][0];
            endArr[i]=arr[i][1];
        }

        Arrays.sort(startArr);
        Arrays.sort(endArr);

        int startpoint=0;
        int endpoint=0;
        int max=0;
        int count=0;

        while (startpoint<arr.length){
            if(startArr[startpoint]<endArr[endpoint]){
                count++;
                startpoint++;
            }
            else{
                count--;
                endpoint++;
            }
            max=Math.max(max,count);
        }
        System.out.println(max);

        // time complexities= n log n for sorting, n for traversal of array== so n log n

    }
}
