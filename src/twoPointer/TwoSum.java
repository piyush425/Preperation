package twoPointer;

public class TwoSum {
    public static void main(String[] args) {

        int[] numbers={2,7,11,15};
        int target=9;

        int i=0;
        int j=numbers.length;

        while(i<j){
            if(numbers[i]+numbers[j]==target){
                int[] arr=new int[2];
                arr[0]=i+1;
                arr[1]=j+1;
//                return arr;
            }
            else if (numbers[i]+numbers[j]<target){
                i++;
            }
            else {
                j--;
            }

        }
//        return new int[0];

    }
}
