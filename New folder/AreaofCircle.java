import java.util.*;

public class AreaofCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of the circle  :");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }
}