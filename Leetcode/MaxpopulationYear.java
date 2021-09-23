package Leetcode;

public class MaxpopulationYear {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++){
                arr[logs[i][0]-1950]++;
                arr[logs[i][1]-1950]--;
            }    
        int maxyear = 1950;
        int maxvalue = 0;
        for(int i = 1; i < 101; i++){
            arr[i] += arr[i-1];
            }
        for(int i = 0; i <101; i++){
            if(maxvalue < arr[i]){
                maxvalue = arr[i];
                maxyear = i + 1950;
            }
        }
        return maxyear;
    }
}
