package Leetcode;

public class RemoveDuplicatedFromSortedArry {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
      int res = 1;
      for(int i = 1; i < nums.length; i++){
        if(nums[i] != nums[i - 1]){
          nums[res] = nums[i];
          res++;
        }
      }
       return res;
    //     int i = 0;
    // for (int n : nums)
    //     if (i == 0 || n > nums[i-1])
    //         nums[i++] = n;
    // return i;
    }
}
