import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            String s = sc.next();
            if (s.equals("q")||s.equals("Q"))
                break;
            else
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}
