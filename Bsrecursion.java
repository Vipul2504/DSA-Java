
public class Bsrecursion {
    public static void main(String[] args) {
        int[] arr = { 83, 5, 56, 13, 29, 3, 5, 66, 100 };
        int target = 5;

        System.out.println(bs(arr, target, 0, arr.length - 1));
    }

    static int bs(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]) {
            return bs(arr, target, start, mid - 1);
        }
        return bs(arr, target, mid + 1, end);
    }
}
