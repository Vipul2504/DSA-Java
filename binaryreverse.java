import java.util.Scanner;
public class binaryreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0; int decimal=0; int rem =0;
        while(n!=0){
             rem = n%10;
            int value = (int)(Math.pow(2, count));
            decimal = decimal + (rem*value);
            n/=10;
            count++;

        }
        System.out.println(decimal);
    }
}
