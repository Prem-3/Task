import java.util.*;

public class Coordinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0)
            System.out.println(x + " and " + y + " is in 1st quadrant");
        else if (x > 0 && y < 0)
            System.out.println(x + " and " + y + " is in 2nd quadrant");
        else if (x < 0 && y < 0)
            System.out.println(x + " and " + y + " is in 3rd quadrant");
        else
            System.out.println(x + " and " + y + " is in 4th quadrant");
    }

}
