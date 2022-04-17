import java.util.ArrayList;
import java.util.List;
import java.lang.*;

class Employee {
    protected long employeeId;
    protected String firstName;
    protected String lastName;

    public Employee(long employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isEqual(Employee other) {
        if ((this.employeeId == other.employeeId) && (this.firstName == other.firstName)
                && (this.lastName == other.lastName))
            return true;
        else
            return false;
    }

    public int compareTo(Employee other) {
        if (this.employeeId == other.employeeId)
            return 0;
        else if (this.employeeId > other.employeeId)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

}

public class Collections {

    public static void main(String[] args) {
        Employee obj1 = new Employee(123, "prem", "kumar");
        Employee obj2 = new Employee(1875, "pk", "k");
        Employee obj3 = new Employee(8315, "ram", "p");
        List<Employee> aList = new ArrayList<>();
        aList.add(obj1);
        aList.add(obj2);
        aList.add(obj3);
        aList.forEach(System.out::println);
        System.out.println(obj1.isEqual(obj2));
        System.out.println(obj1.isEqual(obj3));
        System.out.println(obj1.compareTo(obj2));
        System.out.println(obj3.compareTo(obj2));
    }
}
