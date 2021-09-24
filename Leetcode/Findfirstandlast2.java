package Leetcode;

public class Findfirstandlast2 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int n = nums.length;
        int start = -1; int end = -1;
        for(int i = n - 1; i >= 0; i--){
                if(target == nums[i]){
                    end = i;
                    break;
                }
        for( i = 0; i < nums.length; i++){
            if(target == nums[i]){
                start = i;
                break;
            }
            }
            
            
        }
        res[0] = start;
            res[1]= end;
        return res;
    }
}
