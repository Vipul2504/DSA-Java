import java.util.Arrays;

public class tringlesumofarray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        tringlearr(arr);

    }

    public static void tringlearr(int arr[]) {
        if (arr.length < 1) {
            return;
        }

        int temp[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int x = arr[i] + arr[i + 1];
            temp[i] = x;
        }

        tringlearr(temp);
        System.out.println(Arrays.toString(arr));
    }
}
