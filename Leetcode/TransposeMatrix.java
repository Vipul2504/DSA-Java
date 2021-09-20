package Leetcode;
public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] arr = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j =0; j < m; j++){
                // int temp = arr[j][i];
                arr[i][j] = matrix[j][i];
                // arr[j][i] = temp;
            }
        
        }
        return arr;
}
}
