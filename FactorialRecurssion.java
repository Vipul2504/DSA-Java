public class FactorialRecurssion {
    public static void main(String[] args) {
        int ans = facto(5);
        int ans2 = factoofsum(5);
        System.out.println(ans);
        System.out.println(ans2);
    }

    static int facto(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * facto(n - 1);
    }

    static int factoofsum(int n) {
        if (n <= 1) {
            return 1;
        }

        return n + facto(n - 1);
    }

}
