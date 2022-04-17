interface Reverse {
    String rev(String str);
}

public class StringRevUsingLamda {
    public static void main(String[] args) {
        Reverse x = (str) -> {
            String res = "";
            for (int i = str.length() - 1; i >= 0; i--)
                res += str.charAt(i);
            return res;
        };
        System.out.println("Prem Reversed : " + x.rev("Prem"));
    }
}
