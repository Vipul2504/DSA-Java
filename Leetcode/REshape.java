package Leetcode;

public class REshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r * c){
            return mat;
        }
        int[][] arr = new int[r][c];
        int sr = 0;
        int sc = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(sc == c){
                    sc++;
                    sc = 0;
                }
                arr[sr][sc] = mat[i][j];
                sc++;
            }
        }
        return arr;
    }

}
