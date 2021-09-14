package Leetcode;

public class RunningArrSum {
    public static void main(String[] args) {
        int[] array= new int[num.length];
        array[0] = num[0];
        for(int i = 1;i<num.length;i++){
            array[i]=nums[i]+array[i-1];
        }
        return array
    }
}
