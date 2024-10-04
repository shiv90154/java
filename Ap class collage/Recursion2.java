public class Recursion2 {

    public static int count = 0;

    public static void p() {
        count++;
        if (count <= 5) {
            System.out.println("hello" + count);
            p();
        }
    }

    public static void main(String[] args) {
        p();
    }
}
