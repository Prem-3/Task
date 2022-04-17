class Rakesh {
    int age;

    Rakesh(int age) {
        this.age = age;
    }
}

public class Drive {
    public static void main(String[] args) {

        Rakesh obj = new Rakesh(21);
        System.out.println(obj.age);

    }
}