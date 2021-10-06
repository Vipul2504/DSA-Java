

import java.util.Arrays;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 8, 6, 45, -23, -45, 0 };
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void sortBubble(int[] arr) {
        // run the step n - 1 times
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            // for each step max will come at last respective index
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if array is sorted and there is no swape then no need to go in for(j -loop)
            if (!swapped) {
                break;
            }
        }
    }
}
