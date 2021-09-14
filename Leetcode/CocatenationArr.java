package Leetcode;

public class CocatenationArr {
    public static void main(String[] args) {

    }
    static int[] nums(nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i=0;i<n;i++){
            ans[i]= ans[i+n]= nums[i];

        }
        return ans;
    }

