
public class RangePrime {

    public static boolean IsPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void Primerange(int n) {
        for (int i = 2; i <= n; i++) {
            if (IsPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Primerange(100);
    }
}