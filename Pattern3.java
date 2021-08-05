import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;       
        for( i=1; i<=n;i++){
            int start = i;
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start--;
            }
            System.out.println("");
        }
    }
}
