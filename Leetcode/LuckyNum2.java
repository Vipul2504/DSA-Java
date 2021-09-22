package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LuckyNum2{
    public List<Integer> luckyNumbers (int[][] matrix){
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < matrix.length; i++){
            int minIndex = 0; 
            int min = 99999999;
            for(int j = 0; j < matrix[i].length; j++){
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            boolean Istrue = true;
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][minIndex] < matrix[j][minIndex]){
                    Istrue = false;
                    break;
                }
                if(Istrue){
                    arr.add(matrix[i][minIndex]);
                }
            }
        }
        return arr;
    }
}