package IntervalDsa;

import java.util.Arrays;

public class MeetingRoom1 {

    public static void main(String[] args) {

        /**
         * arr={[0, 30], [5, 10], [15, 20]}
         *
         * Answer=false
         */

         int[][] arr={{1,10},{5,10},{15,20}};


         boolean res=true;
        Arrays.sort(arr,(a,b)->a[0]-b[0]);

         for (int i=1;i<arr.length;i++){
             if (arr[i][0]<arr[i-1][1]){
                 res=false;
                 break;
             }

         }
         System.out.println(res);

    }
}
