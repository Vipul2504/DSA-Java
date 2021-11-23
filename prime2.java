import java.util.*;

public class prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int i = 0;
        if (num1 % 2 == 1) {
            System.out.println("Prime");
            i++;
        } else {
            System.out.println("Not Prime");
        }
    }
}
