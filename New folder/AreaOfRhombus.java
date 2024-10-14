import java.util.*;

public class AreaOfRhombus {

    public static void main(String[] args) {
        System.out.println("Area Of Rhombus = 1/2*diagonals*diagonals  Enter diagonal one and two");
        Scanner s = new Scanner(System.in);
        double diagonal = s.nextDouble();
        double diagonal2 = s.nextDouble();
        double area = 0.5 * diagonal * diagonal2;
        System.out.println(area);
    }
}