import java.util.*;

public class PerimeterOfCircle {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Perimeter of circle");
        double r = s.nextDouble();
        double parameter = Math.PI * r * 2;
        System.out.println(parameter);
    }
}
