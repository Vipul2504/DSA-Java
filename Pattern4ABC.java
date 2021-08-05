import java.util.*;
public class Pattern4ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1; 
        for(i=1;i<=n;i++)
        {
            char start = (char)('A'+i-1);
            for(int j=1; j<=i;j++)
            {
                System.out.print(start);
                start = (char)(start+1);
            }
        } 
        System.out.println();
    }
}
