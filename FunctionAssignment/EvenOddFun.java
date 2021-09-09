import java.util.Scanner;
public class EvenOddFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ansodd = evenOdd(n);
        System.out.println("The num is "+ansodd);

    }

    static boolean evenOdd(int n){
        if(n%2==0){
            return true;
        }
        else return false; 
    }
    
}
