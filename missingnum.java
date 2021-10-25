

public class missingnum {
    public int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] ; //beacuse it is started from 0 
            // int index = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct] ){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
            for (int index = 0; index < arr.length; index++) {
                if(arr[i] != index){
                    return index;
                }
            }
        }
        return arr.length;
    }

     static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        }
}
