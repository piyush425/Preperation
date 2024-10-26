package Array;

public class findMinInRotated {
    public static void main(String[] args) {
        int[] arr={11,13,15,17};

        int min=calculate(arr);

        System.out.println(min);


}

    private static int calculate(int[] arr) {

        int i=0;
        int j=arr.length-1;
        int min=999999;

        if (arr[i] < arr[j]) {
            return arr[i];
        }
        while (i < j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] > arr[j]) {
                // The minimum element is in the right half
                i = mid + 1;
            } else {
                // The minimum element is in the left half
                j = mid;
            }
        }
        return arr[i];
    }

    }
