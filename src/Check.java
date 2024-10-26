import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Check {

    public static void main(String[] args) throws ParseException {

        Date currentDate = new Date();

        System.out.println(currentDate.toString());



        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");


        String dateString = formatter.format("2024-09-14 15:46:35.507");


        System.out.println(dateString);

    }



    private static void setInMethod(Boolean bool) {
        bool = false;
    }

    public static int sumOfPrimeFactors(int number,boolean flag) {
        List<Integer> primeFactors = getPrimeFactors(number);
        int sum = 0;
        for (int factor : primeFactors) {
            sum += factor;
        }
        flag=true;
        return sum;

    }

    // Method to get the prime factors of a number
    public static List<Integer> getPrimeFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        return factors;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {  // Corrected condition
                return false;
            }
        }
        return true;
    }


};





//        for (int[] n:nums){
//            System.out.println(Arrays.toString(n));
//        }
//
//        int meeting = 1;
//        int lastMeet = nums[0][1];
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i][0] >=lastMeet) {  // The next meeting can start after the last meeting ends
//                meeting++;
//                lastMeet = nums[i][1];
//            }
//        }
//        System.out.println(meeting);




//    private static boolean isSubStr(String s) {
//        int length = s.length();
//
//        for(int i=1;i<=s.length()/2;i++){
//            if(length % i ==0){
//                String sbr=s.substring(0,i);
//
//                StringBuilder stringBuilder=new StringBuilder();
//
//                for (int j=0;j<length/i;j++)
//                {
//                    stringBuilder.append(sbr);
//                }
//
//                if (stringBuilder.toString().equals(s)){
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }















//        int[] originalArray = {1, 2, 3, 4, 5};
//
//        // Shallow copy of the original array
//        int[] shallowCopyArray = originalArray;
//
//        int[] deepCopyArray = new int[originalArray.length];
//
//        for(int i=0;i<originalArray.length;i++){
//            deepCopyArray[i]=originalArray[i];
//        }
//        // Modify the original array
//        originalArray[0] = 99;
//        System.out.println("Original array: " + Arrays.toString(originalArray)); // Output: [99, 2, 3, 4, 5]
//        System.out.println("Shallow copy array: " + Arrays.toString(shallowCopyArray)); // Output: [1, 2, 3, 4, 5]
//        System.out.println("deep copy array: " + Arrays.toString(deepCopyArray)); // Output: [1, 2, 3, 4, 5]


//
//        int[] nums1={1,2,3,0,0,0};
//        int[] nums2={2,5,6};
//        int m=nums1.length;
//        int n=nums2.length;
//
//        int[] merged = new int[m + n];
//
//        int i = 0, j = 0, k = 0;
//
//        // Merge the two arrays
//        while (i < m && j < n) {
//            if (nums1[i] <= nums2[j]) {
//                merged[k] = nums1[i];
//                i++;
//            } else {
//                merged[k] = nums2[j];
//                j++;
//            }
//            k++;
//        }
//
//        // Copy any remaining elements from nums1
//        while (i < m) {
//            merged[k] = nums1[i];
//            i++;
//            k++;
//        }
//
//        // Copy any remaining elements from nums2
//        while (j < n) {
//            merged[k] = nums2[j];
//            j++;
//            k++;
//        }
//
//        // Copy the merged elements back into nums1
//        for (i = 0; i < m + n; i++) {
//            nums1[i] = merged[i];
//        }
//    }
//    private static void quickSort(int[] arr, int low, int high) {
//
//        if (low<=high){
//            int paviot=getPaviotValue(arr,low,high);
//            quickSort(arr,low,paviot-1);
//            quickSort(arr,paviot+1,high);
//        }
//    }
//    private static int getPaviotValue(int[] arr, int low, int high) {
//
//        int paviot=arr[high];
//        int i=low-1;
//
//        for(int j=low;j<high;j++){
//            if(arr[j]<=paviot) {
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//
//        i++;
//        int temp=arr[i];
//        arr[i]=arr[high];
//        arr[high]=temp;
//        return i;
//    }










//    public static void minDiffAfterModifyAnyThreeNum(String[] args) {
//
//        int[] nums={5,3,2,4};
//        int n=nums.length;
//
//        Arrays.sort(nums);
//
//        if(nums.length<4){
//            return 0;
//        }
//
//        int dif1=nums[n-4]-nums[0];
//        int diff2=nums[n-3]-nums[1];
//        int diff3=nums[n-2]-nums[2];
//        int diff4=nums[n-1]-nums[3];
//
//        int min=Math.min(Math.min(dif1,diff2),Math.min(diff3,diff4));
//        return min;
//
//
