
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter a number for factorial :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;

        }
        System.out.print(fact);
    }
}
