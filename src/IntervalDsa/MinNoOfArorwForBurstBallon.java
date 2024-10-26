package IntervalDsa;

import java.util.Arrays;

public class MinNoOfArorwForBurstBallon {
    public static void main(String[] args) {

        /**
         * Input: points = [[10,16],[2,8],[1,6],[7,12]]
         * Output: 2
         * Explanation: The balloons can be burst by 2 arrows:
         * - Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
         * - Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
         *
         * Input: points = [[1,2],[3,4],[5,6],[7,8]]
         * Output: 4
         * Explanation: One arrow needs to be shot for each balloon for a total of 4 arrows.
         *
         * Input: points = [[1,2],[2,3],[3,4],[4,5]]
         * Output: 2
         * Explanation: The balloons can be burst by 2 arrows:
         * - Shoot an arrow at x = 2, bursting the balloons [1,2] and [2,3].
         * - Shoot an arrow at x = 4, bursting the balloons [3,4] and [4,5].
         */


        //[[3,9],[7,12],[3,8],[6,8],[9,10],[2,9],[0,9],[3,9],[0,6],[2,8]]



        int[][] arr={{3,9},{07,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};



        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        //{{0, 9}, {0, 6}, {2, 9}, {2, 8}, {3, 9},{3, 8}, {3, 9}, {6, 8}, {7, 12}, {9, 10}}// sort by 0 index

        //{{0, 6}, {3, 8}, {6, 8}, {2, 8}, {3, 9},{2, 9}, {0, 9}, {3, 9}, {9, 10}, {7, 12}}// sort by 1 index

        //this is reason we have to sort by 1 index not 0.





        int[] newArray=arr[0];
        int count=1;

        for (int i=1;i<arr.length;i++){
            if(Math.abs(arr[i][0]) <=Math.abs(newArray[1])){
                continue;
            }
            else{
                count++;
                newArray=arr[i];
            }
        }
        System.out.println(count);

    }
}
