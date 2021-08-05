import java.util.Scanner;
public class Whilesumofodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i=1;
        while (i<=n) {
            sum=sum+i;
            i=i+2;

        }
    //    int sum =(n*(n+1))/2;   //optimization code which help in time and space complexity
        System.out.println(sum);
    }   
}
// ((n/2)*(a+l))