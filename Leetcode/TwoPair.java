package Leetcode;

public class TwoPair {
    public int numIdenticalPairs(int[] nums) {
        int[] arr = new int[nums.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(nums[i]==nums[j]){
                    count++ ;
                }
                
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
