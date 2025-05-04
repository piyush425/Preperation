package IntervalDsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class revise {
    public static void main(String[] args) {

        /**
         * arr={[1,3], [4,5], [7,10], [16, 17]};
         *
         * arr2={[2,3], [4,8], [11,15]};
         *
         * result={[1,3], [4, 10], [11, 15], [16, 17]}
         */

        int[][] arr1={{1,3},{4,5},{7,10},{16,17}};
        int[][] arr2={{2,3},{4,8},{11,15}};

        int[] current=null;

        Arrays.sort(arr1,(a,b)->a[0]-b[0]);
        Arrays.sort(arr2,(a,b)->a[0]-b[0]);

        int i=0;
        int j=0;

        List<int[]> list=new ArrayList<>();

        while (i<arr1.length || j<arr2.length){

            int[] intervals1=i<arr1.length?arr1[i]:new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE};
            int[] intervals2=j<arr2.length?arr2[j]:new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE};

            if(intervals1[0]<=intervals2[0]){
                if (current!=null){
                    current=intervals1;
                }
                else if(current[1]>=intervals1[0]){
                    current[1]=Math.max(current[1],intervals1[1]);
                }
                else {
                    list.add(current);
                    current=intervals1;
                }

                i++;

            }
            else{
                if (current!=null){
                    current=intervals2;
                }
                else if(current[1]>intervals2[0]){
                    current[1]=Math.max(current[1],intervals2[1]);
                }
                else {
                    list.add(current);
                    current=intervals2;
                }
                j++;

            }

        }
        if(current!=null){
            list.add(current);

        }

        for (int[] s:list){
            System.out.println(Arrays.toString(s));
        }











    }
}
