import java.util.*;
public class Fibanocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1 || n==2){
            System.out.println(1);
            return;
        }
        int a=1,b=1,c=0;
        int j=3;         //3rd term 
        while(j<=n){
            c=a+b;a=b;b=c;
            j++;
        }
        System.out.println(c);
    }
}
