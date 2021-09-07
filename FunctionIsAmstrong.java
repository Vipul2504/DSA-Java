import java.util.Scanner;
public class FunctionIsAmstrong {
    static boolean Isamstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n= n/10;
            sum = sum + rem*rem*rem;
        }

    return sum ==original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = Isamstrong(n);
        System.out.println(ans);
    }
}
