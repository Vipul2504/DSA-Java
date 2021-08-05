import java.util.*;
public class Pattern5EDC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j = 1;
            char start = (char)('A'+n-1);
            while(j<=i){
                System.out.print(start);
                start=(char)(start+1);
                j++;

            }
            i++;
            System.out.println();
        }
    }   
}
