import java.io.*;
import java.util.Scanner;

class MyBean {
	String firstName;
	String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public static MyBean getInstance() {
		return new MyBean();
	}

	@Override
	public String toString() {
		return "MyBean [firstName=" + firstName + ", lastname=" + lastName + "]";
	}
}

public class FileRead {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("data.txt");
		Scanner scan = new Scanner(file);
		MyBean mybean = new MyBean();
		mybean.setFirstName(scan.nextLine());
		mybean.setLastName(scan.nextLine());
		System.out.println(mybean);
	}
}