package Leetcode;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2,4,5,7,9,13,11};
        int target = 18;
        int x =-1;
        int y=-1;
    }

    public int[] TwoSum(int[] num,int target){
        for(int i = 0; i<num.length;++i){
            for(int j=i+1; j<num.length;++j){
                if(num[i]+num[j]==target){
                    return(j,i);
                }
            }  
        }
    }
}
