class UniversityStudent {
    static final String university = "ABC";
    static int count = 1;
    private int rollNo;
    private String name;
    String homeTown;

    UniversityStudent() {
        this.rollNo = count;
        count++;
        this.name = "PK";
        this.homeTown = "hyd";
    }

    UniversityStudent(String name, String homeTown) {
        this();
        this.name = name;
        this.homeTown = homeTown;
    }

    UniversityStudent(String name) {
        this();
        this.name = name;
    }

    void display() {
        System.out.println("rollNo is: " + this.rollNo);
        System.out.println("name is: " + this.name);
        System.out.println("university is: " + university);
        System.out.println("homeTown is: " + this.homeTown);
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

public class ConstructChain {

    public static void main(String[] args) {

        UniversityStudent c2 = new UniversityStudent();

        c2.display();
        System.out.println("-------------------");

        UniversityStudent c3 = new UniversityStudent("Prem", "Hyderabad");
        c3.display();
        System.out.println("-------------------");
        UniversityStudent c4 = new UniversityStudent("Kumar");

        c4.display();
    }
}