package function;

public class subtract {

    public static int subtract1(int a, int b, int c) {
        int add = a - b - c;
        return add;

    }

    public static void main(String[] args) {
        int result = subtract1(10, 2, 1);
        System.err.println("a-b-c = " + result);
    }

}
