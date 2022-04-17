import java.util.*;
import java.util.stream.*;
class Employee1
{
    int id;
    String name; 
    int age;
    String gender; 
    String department;  
    int yearOfJoining;
    double salary;
      
    public Employee1(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
      
    public int getId() 
    {
        return id;
    }
      
    public String getName() 
    {
        return name;
    }
      
    public int getAge() 
    {
        return age;
    }
      
    public String getGender() 
    {
        return gender;
    }
      
    public String getDepartment() 
    {
        return department;
    }
      
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
      
    public double getSalary() 
    {
        return salary;
    }
      
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
}
public class EmployeeStatistics{
    public static void main(String[] args){
        Employee1 emp1 = new Employee1(3, "Vishal Singhal", 34, "male", "HR", 2013, 300000);
        Employee1 emp2 = new Employee1(4, "Amitabh Singh", 35, "male", "Admin", 2014, 500000);
        Employee1 emp3 = new Employee1(5, "Vivek Bhati", 28, "male", "Admin", 2017, 500000);
        Employee1 emp4 = new Employee1(6, "Vipul Diwan", 34, "male", "Account", 2014, 200000);
        Employee1 emp5 = new Employee1(7, "Satish Kumar", 29, "male", "Account", 2017, 75000);
        Employee1 emp6 = new Employee1(8, "Geetika Chauhan", 30, "female", "Admin", 2016, 90000);
        List<Employee1> employeeList = Arrays.asList(emp1, emp2, emp3, emp4, emp5,emp6);
        Map<String,Integer> mapDeptCount = new HashMap<>();
        for(Employee1 e : employeeList)
            mapDeptCount.put(e.getDepartment(), mapDeptCount.getOrDefault(e.getDepartment(), 0)+1);
        System.out.println(mapDeptCount);


        //2 salary 
        int m = 0,f = 0;
        Map<String,Double> mapSalary = new HashMap<>();
        for(Employee1 e : employeeList){
            mapSalary.put(e.getGender(),mapSalary.getOrDefault(e.getGender(), 0.0)+e.getSalary());
            if(e.getGender().equals("male")) m++;
            else f++;
        }
        for(String i : mapSalary.keySet()){
            Double amt = mapSalary.get(i);
            if(i.equals("male"))mapSalary.put(i,amt/m);
            else mapSalary.put(i,amt/f);
        }
        System.out.println(mapSalary);
            
        //3 highest pay 
        DoubleSummaryStatistics empStats = employeeList.stream().collect(Collectors.summarizingDouble(Employee1::getSalary));
        System.out.println(empStats.getMax());

        //4 avg age
        IntSummaryStatistics empAge = employeeList.stream().collect(Collectors.summarizingInt(Employee1::getAge));
        System.out.println(empStats.getAverage());

        //5 & 6 -> senior-most & junior-most
        String senior = "";
        String junior = "";
        int mxExp = Integer.MIN_VALUE;
        int mnExp = Integer.MAX_VALUE;
        for(Employee1 i: employeeList){
            if(mxExp < (2022 - i.getYearOfJoining())){
                mxExp = 2022 - i.getYearOfJoining();
                senior = i.toString();
            }
            if(mnExp > (2022 - i.getYearOfJoining())){
                mnExp = 2022 - i.getYearOfJoining();
                junior = i.toString();
            }
        }
        System.out.println(senior);
        System.out.println(junior);

        //8  
        Map<String,Integer> mapGender = new HashMap<>();
        for(Employee1 e : employeeList)
            mapGender.put(e.getGender(), mapGender.getOrDefault(e.getGender(), 0)+1);
        System.out.println(mapGender);

    }
}