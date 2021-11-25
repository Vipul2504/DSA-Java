public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 3, 55, 45, 12, 61, 2, 9, 10, -7, 0 };
        int target = 55;
        int ans = Binary(arr, target);
        System.out.println(ans);
    }

    public static int Binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
