import java.util.Scanner;
public class FunctionPrime {
    static boolean Isprime(int n){
        if(n<=1){
            return false;
        }
        int num = 2;
        while(num*num<=n){
            if(n%num==0){
                return true;
            }
            num++;
        }
        return num*num>n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = Isprime(n);
        System.out.println(ans);
    }
}
