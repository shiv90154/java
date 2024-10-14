
import java.util.Scanner;

public class AreaOfEquilateralTriangle {

    // Area of equilateral triangle = √3/4 × (side)2
    public static void main(String[] args) {

        System.out.println("Area of equilateral triangle =  √3/4 × (side)2");
        Scanner s = new Scanner(System.in);
        double side = s.nextDouble();
        double area = Math.sqrt(3) / 4 * side * side;
        System.out.println(area);
    }
}
