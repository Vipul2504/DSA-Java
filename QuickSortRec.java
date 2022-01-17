import java.util.Arrays;

public class QuickSortRec {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 9, 3, 10, 2, 11 };
        quicks(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicks(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e++;
            }
        }

        quicks(arr, low, e);
        quicks(arr, s, high);
    }
}
