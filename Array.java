import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
    //     int[] arr = new int[5];
    //     //array are mutable in java
    //     //
    //    int[] arr1 ={2,34,23,53,67};
    //    for (int theint:arr1){
    //        System.out.println(theint);
    //    }
    Scanner in = new Scanner(System.in);
        

       int[][] arr2D = new int[3][3];

       for (int row = 0; row < arr2D.length; row++){
           for(int col = 0; col < arr2D[row].length; col++){
               arr2D[row][col] = in.nextInt();
           }
           System.out.println();
       }
       for (int row = 0; row < arr2D.length; row++){
           for(int col = 0; col < arr2D[row].length; col++){
               System.out.print(arr2D[row][col] + " ");
           }
           System.out.println();
       }

    }
}
