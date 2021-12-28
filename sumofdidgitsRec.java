public class sumofdidgitsRec {
    public static void main(String[] args) {
        int ans = sumofdigits(1625353);
        System.out.println(ans);
    }

    static int sumofdigits(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumofdigits(n / 10);
    }
}
