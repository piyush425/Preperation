package FrequentAskedDsa;

public class minimalelementInRoatatedArray {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};

        int i=0;
        int j=arr.length-1;


        while (i<j){
            int mid=i+(j-i)/2;
            if(arr[mid]>arr[j]){
                i=mid+1;
            }
            else {
                j=mid;
            }
        }
        System.out.println(arr[i]);
    }
}
