import java.util.ArrayList;
import java.util.Scanner;
public class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>(5);
        Scanner in = new Scanner(System.in);
        // int n = sc.nextInt();
        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }
        for(int i = 0; i<5; i++){
            System.out.println(list.get(i));
        }
    }
}