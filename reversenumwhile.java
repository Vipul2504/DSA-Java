import java.util.Scanner;
public class reversenumwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Reverse_Num = 0;
        while(n!=0){
            int rem = n%10;
            Reverse_Num = Reverse_Num*10 + rem;
            n/=10;
        }
        System.out.println(Reverse_Num); 
    }
}
