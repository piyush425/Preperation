package IntervalDsa;

import java.util.Arrays;

public class CarPooling {

    public static void main(String[] args) {
        /**
         * [[2,1,5],[3,3,7]], capacity = 4
         *
         * false
         */

        int[][] trips = {{2, 1, 5}, {3, 3, 6}, {5, 6, 8}};
        int capacity = 16;

        Arrays.sort(trips, (a, b) -> Integer.compare(a[1], b[1]));

        int[] arr=new int[1001];

        for (int i=0;i<trips.length;i++){
            int passengers=trips[i][0];
            int start=trips[i][1];
            int stop=trips[i][2];

            arr[start]+=passengers;
            arr[stop]-=passengers;
        }

        int currentPassengers=0;

        for (int j=0;j<arr.length;j++){
            currentPassengers+=arr[j];
            if(currentPassengers>capacity){
                //return false;
            }
        }
        //return true;
    }
}
