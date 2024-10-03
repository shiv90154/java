public class IsPrime {

    // public static boolean IsPrime(int n) {
    // boolean IsPrime = true;
    // for (int i = 2; i <= n - 1; i++) {

    // if (n % i == 0) {
    // IsPrime = false;
    // break;
    // }
    // }
    // return IsPrime;

    // }

    // OPtimized code for prime number

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

    public static void main(String[] args) {
        System.out.println(IsPrime(5));
    }
}
