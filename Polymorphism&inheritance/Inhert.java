class Person {
    protected String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    private double salary;
    private int year;
    private String Uan;

    Employee(String name, double salary, String Uan, int year) {
        super(name);
        this.salary = salary;
        this.Uan = Uan;
        this.year = year;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getUAN() {
        return Uan;
    }

    public void setUAN(String Uan) {
        this.Uan = Uan;
    }

    protected void display() {
        System.out.println("Employee [Uan=" + Uan + ", salary=" + salary + ", year of Joining=" + year + "]");
    }

}

public class Inhert {
    public static void main(String[] args) {
        Person p = new Person("pk");
        Employee e = new Employee("Prem", 50000, "ABC123", 2020);
        Employee e1 = new Employee("kumar", 40000, "XYZ100", 2020);
        e.display();
        e1.display();
        if (p.name.equals(e.name)) {
            System.out.println("Equal");
        } else {
            System.out.println("not equal");
        }
        if (e.equals(e1)) {
            System.out.println("Both r equal");
        } else {
            System.out.println("both r not equal");
        }
        System.out.println("p1==e1 " + (p == e1));
        System.out.println("e==e1 " + (e == e1));
    }
}