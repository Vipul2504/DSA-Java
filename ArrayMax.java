public class ArrayMax {
    public static void main(String[] args) {
        int[] array = {2,44,56,8,23,86,34,76,3};
        System.out.println(max(array));
        System.out.println(maxinRange(array,1,4));

    }
    static int max(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
    static int maxinRange(int[] array,int start, int end){
        int max = array[start];
        for(int i = start; i <= end; i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
