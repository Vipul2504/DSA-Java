import java.util.Scanner;
public class Minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();
        int ansMax=max(n, m, o);
        int ansMin=min(n, m, o);
        System.out.println("The maximum num is "+ansMax);
        System.out.println("The minmum num is "+ansMin);
    }
    static int max(int n,int m,int o){
        if (n>m && n>o){
            return n;
        }
        else if(m>n && m>o){
            return m;

        }
        else return o;
    }
    
    static int min(int n,int m,int o){
        if (n<m && n<o){
            return n;
        }
        else if(m<n && m<o){
            return m;

        }
        else return o;
    }
}
