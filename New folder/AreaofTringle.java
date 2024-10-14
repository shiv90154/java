import java.util.*;

public class AreaofTringle {

    public static void main(String[] args) {
        System.out.println("Enter the height and base :  ");
        Scanner s = new Scanner(System.in);
        double base = s.nextDouble();
        double Height = s.nextDouble();
        double area = 0.5 * Height * base;
        System.out.println(area);

    }
}
