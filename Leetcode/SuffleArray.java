package Leetcode;
class SuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int j = 0;
        for(int i = 0; i < 2*n; i=i+2){
            arr[i] = nums[j++];
            int k=n;
            for(int m = 1; m < 2*n; m=m+2){
                arr[m] = nums[k++];
            }
        }
         return arr;
    }   
       
}