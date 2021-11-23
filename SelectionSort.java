

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,3,6,9,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int min_idx = i;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
    
