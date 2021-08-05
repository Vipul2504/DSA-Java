import java.util.Scanner;

public class SumofALLEvenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0;
        int even = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                even = even + i;
            } else {
                odd = odd + i;
            }
            i++;
        }
        System.out.println("Sum of even is " + even);
        System.out.println("Sum of odd is " + odd);
    }
}
