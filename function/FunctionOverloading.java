public class FunctionOverloading {

    public static int Sum(int a, int b) {
        return a + b;

    }

    // public static int Sum(int a, int b, int c) {
    // return a + b + c;

    //

    // different data types function overloading

    public static float Sum(float a, float b) {
        return a + b;

    }

    public static void main(String[] args) {

        System.out.println(Sum(2, 10));
        System.out.println(Sum(2.5f, 3.5f));
        // System.err.println(Sum(6, 6, 6));
    }
}
