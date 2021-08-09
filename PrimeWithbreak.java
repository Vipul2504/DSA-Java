import java.util.Scanner;
public class PrimeWithbreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =2; i<=n; i++){
            Boolean isdivide = false;
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    isdivide = true;
                    break;
                }
                if(!isdivide)
                System.out.println(i);
            }
        }
    }
}
