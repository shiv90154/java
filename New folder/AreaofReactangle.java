import java.util.*;

public class AreaofReactangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of area :");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double area = length * width;
        System.out.println(area);
    }
}
