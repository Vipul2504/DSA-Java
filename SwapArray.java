import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,9,4};
        Scanner in = new Scanner(System.in);
        Swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }

    static void Swap(int[] arr, int Index1, int Index2){
        int temp = arr[Index1];
        arr[Index1] = arr[Index2];
        arr[Index2] = temp;
    }
}
