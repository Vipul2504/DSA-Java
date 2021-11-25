import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 5, 1, 3, 5, 4, 4, 1, 2, 5, 3, 2 };
        Countsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Countsort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] - min;
            count[idx]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = output.length - 1; i >= 0; i--) {
            int val = arr[i];
            int pos = count[val - min];
            int idx = pos - 1;
            output[idx] = val;
            count[val - min]--;
        }

        for (int i = 0; i < output.length; i++) {
            arr[i] = output[i];
        }
    }
}
