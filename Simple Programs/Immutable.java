import java.util.Scanner;

final class Immutable {

    private final String firstName;
    private final int age;

    Immutable(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Immutable [age=" + age + ", firstName=" + firstName + "]";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String st = sc.next();
        Immutable obj = new Immutable("pk", 22);
        System.out.println(obj);

    }
}