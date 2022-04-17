final class Immutable {
    private final String content;

    Immutable(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

public class Main {
    public static void main(String[] args) {

        Immutable obj = new Immutable("Pk");
        System.out.println(obj.getContent());

        obj = new Immutable("Prem");
        System.out.println(obj.getContent());
    }
}