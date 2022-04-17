class Student {
    private int rollNo;
    private String name;

    Student() {
        rollNo = -1;
        name = "Name";
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    Student(int rollNo) {
        this.rollNo = rollNo;
        name = "idk";
    }

    Student(String name) {
        rollNo = 00;
        this.name = name;
    }

    void display() {
        System.out.println("rollNo is: " + rollNo);
        System.out.println("name is: " + name);
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Construct {

    public static void main(String[] args) {
        Student c = new Student();
        c.setRollNo(100);
        c.setName("Police");
        c.display();
        Student c2 = new Student();
        // c2.setRollNo(108);
        // c2.setName("Ambulance");
        c2.display();
        Student c3 = new Student(101);
        Student c4 = new Student("fire");
        c3.display();
        c4.display();
    }
}