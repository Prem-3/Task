import java.lang.*;

public class Trim {
    public static void main(String args[]) {
        String s1 = "  Prem Kumar ( Pk )   ";
        System.out.println(s1.length());
        System.out.println(s1); // Without trim()
        String tr = s1.trim();
        System.out.println(tr.length());
        System.out.println(tr);
    }
}
