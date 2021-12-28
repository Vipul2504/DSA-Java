package Recurssion;

public class Nto1 {
    public static void main(String[] args) {
        nto1(5);
        NumtoN(5);
    }

    static void nto1(int n) {

        if (n == 0) {
            return;
        }
        System.out.println(n);
        nto1(n - 1);
    }

    static void NumtoN(int n) {
        if (n == 0) {
            return;
        }

        NumtoN(n - 1);
        System.out.println(n);

    }
}
