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

    
}
