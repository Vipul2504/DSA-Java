package Leetcode;

public class maxofsubarray {
    public int maxSubArray(int[] nums) {
        int r = nums[0];
       int sum = nums[0];
       for(int i = 1;i < nums.length;i++)
       {
           sum = Math.max(nums[i],nums[i]+sum);
           r = Math.max(r,sum);
       }
       return r;
}
