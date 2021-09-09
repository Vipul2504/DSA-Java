import java.util.Scanner;
public class votefucn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean ansodd = vote(age);
        if(vote(age)==true){
            System.out.println("The person is elligible to vote ");
        }
        else{
            System.out.println("Sorry!The person is not elligible to vote ");
        }
    }
    static boolean vote(int age){
        if(age>18){
            return true;
        }
        else return false; 
    }
    
}
