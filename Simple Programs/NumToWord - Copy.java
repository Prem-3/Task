import java.util.*;

public class NumToWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case (1):
                System.out.println("One");
                break;
            case (2):
                System.out.println("two");
                break;
            case (3):
                System.out.println("Three");
                break;
            default:
                System.out.println("enter b/w 1 to 3 only");
        }
    }

}