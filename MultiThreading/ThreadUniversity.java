import java.util.ArrayList;

class Height {

    private int feet;
    private int inches;

    public Height(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
}

abstract class Student {
    private String name;
    private String branch;
    private Height height;

    public Student(String name, String branch, Height height) {
        this.name = name;
        this.branch = branch;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public static int compareByHeight(Student s1, Student s2) {
        if (s1.height.getFeet() == s2.height.getFeet()) {
            if (s1.height.getInches() == s2.height.getInches())
                return 0;
            else if (s1.height.getInches() > s2.height.getInches())
                return 1;
            else
                return -1;
        } else if (s1.height.getFeet() > s2.height.getFeet())
            return 1;

        return -1;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %nBranch: %s %nHeight: %dft. %din. %n", this.name, this.branch,
                this.height.getFeet(), this.height.getInches());
    }
}

class EEEStud extends Student {

    public EEEStud(String name, Height height) {
        super(name, "EEE", height);
    }

}

class ECEStud extends Student {

    public ECEStud(String name, Height height) {
        super(name, "ECE", height);
    }

}

class CSEStud extends Student {

    public CSEStud(String name, Height height) {
        super(name, "CSE", height);
    }

}

class Administration {
    Student[] students;

    public Administration(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void sortByHeight() {
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < this.students.length - 1; i++) {
                if (Student.compareByHeight(this.students[i], this.students[i + 1]) == -1) {
                    Student temp = this.students[i];
                    this.students[i] = this.students[i + 1];
                    this.students[i + 1] = temp;
                }
            }
        }

    }

    public void displaySortedEEEStudents() {

        ArrayList<Student> tempStudents = new ArrayList<Student>();

        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getBranch().equals("EEE")) {
                tempStudents.add(this.students[i]);
            }
        }

        Student[] eeeStud = tempStudents.toArray(new EEEStud[tempStudents.size()]);
        synchronized (this) {
            for (Student s : eeeStud) {
                notifyAll();
                System.out.println(s);
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void displaySortedECEStudents() {

        ArrayList<StudentTwo> tempStudents = new ArrayList<Student>();

        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getBranch().equals("ECE")) {
                tempStudents.add(this.students[i]);
            }
        }

        Student[] eceStud = tempStudents.toArray(new ECEStud[tempStudents.size()]);
        synchronized (this) {
            for (Student s : eceStud) {
                System.out.println(s);
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notifyAll();
            }
        }

    }

    public void displaySortedCSEStudents() {

        ArrayList<Student> tempStudents = new ArrayList<Student>();

        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].getBranch().equals("CSE")) {
                tempStudents.add(this.students[i]);
            }
        }

        Student[] cseStud = tempStudents.toArray(new CSEStud[tempStudents.size()]);

        synchronized (this) {
            for (Student s : cseStud) {
                notifyAll();
                System.out.println(s);
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

public class ThreadUniversity {

    public static void main(String[] args) {
        Student[] students = new Student[6];

        students[0] = new ECEStud("Prem", new HeightTwo(5, 5));
        students[1] = new ECEStud("Elon", new HeightTwo(4, 5));
        students[2] = new EEEStud("Satyadev", new HeightTwo(5, 2));
        students[3] = new EEEStud("Einstein", new HeightTwo(6, 1));
        students[4] = new CSEStud("Tesla", new HeightTwo(4, 9));
        students[5] = new CSEStud("Hawking", new HeightTwo(5, 1));

        Administration Admin = new Administration(students);
        Admin.sortByHeight();

        new Thread() {
            public void run() {
                Admini.displaySortedEEEStudents();
            }
        }.start();

        new Thread() {
            public void run() {
                Admin.displaySortedECEStudents();
            }
        }.start();

        new Thread() {
            public void run() {
                Admin.displaySortedCSEStudents();
            }
        }.start();
    }
}