package Leetcode;

public class ReplaceElemGreatestElemOnRightSide {
    public int[] replaceElements(int[] arr) {
        int temp = 0; int l = -1;
        for(int i = arr.length-1; i >= 0; i--){
            temp = arr[i];
            arr[i] = l;
            l = Math.max(l, temp);
        }
        return arr;
    }
}
