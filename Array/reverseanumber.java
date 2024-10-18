
import java.util.Scanner;

public class reverseanumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int reverse = 0;
        while (number != 0) {
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
