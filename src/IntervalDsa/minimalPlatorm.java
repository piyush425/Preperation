package IntervalDsa;

import java.util.Arrays;

public class minimalPlatorm {

    static int findPlatform(int arr[], int dep[], int n)
    {

        Arrays.sort(arr);
        Arrays.sort(dep);


        int i=0;
        int j=0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count=0;
        int max=0;

        while (i<arr.length && j<arr.length){
            if(arr[i]<dep[j]){
                count++;
                i++;
            }
            else{
                count--;
                j++;
            }
            if(max<count){
                max=count;
            }
        }

        return max;
    }
}
