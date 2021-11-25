
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 78, 5, 4, 33, 20 };
        int target = 2;
        int ans = Linear(arr, target);
        System.out.println(ans);
    }

    public static int Linear(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // for (int i = 0; i < arr.length; i++) {

        // int element = arr[i];
        // if (element == target) {
        // return i;
        // }

        // }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

}
