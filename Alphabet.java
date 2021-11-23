import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);
        if (ch >= 65 && ch < 97) {
            System.out.println("Upper case");
        } else if (ch >= 97) {
            System.out.println("Lower case");
        } else {
            System.out.println(-1);
        }
    }
}