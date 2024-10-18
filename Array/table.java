
import java.util.Scanner;

public class table {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a number :");
        double n = s.nextDouble();

        for (int i = 1; i <= 10; i++) {

            System.out.println(n + "* " + i + "=" + n * i);
        }

    }
}
