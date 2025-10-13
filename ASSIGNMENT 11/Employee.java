// EmployeeManagementSystem.java
import java.util.*;

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: getters/setters
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.printf("ID: %s, Name: %s, Base: %.2f, Final Salary: %.2f%n",
            employeeId, name, baseSalary, calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    private double monthlyBonus;

    public FullTimeEmployee(String id, String name, double baseSalary, double monthlyBonus) {
        super(id, name, baseSalary);
        this.monthlyBonus = monthlyBonus;
    }

    public double getMonthlyBonus() { return monthlyBonus; }
    public void setMonthlyBonus(double monthlyBonus) { this.monthlyBonus = monthlyBonus; }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + monthlyBonus;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0.0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(int hoursWorked) { this.hoursWorked = hoursWorked; }

    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class DeptImpl implements Department {
    private String department;

    public void assignDepartment(String dept) { this.department = dept; }
    public String getDepartmentDetails() { return department == null ? "None" : department; }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FullTimeEmployee f1 = new FullTimeEmployee("FT001","Amit",40000,5000);
        PartTimeEmployee p1 = new PartTimeEmployee("PT001","Neha",250,80);

        employees.add(f1);
        employees.add(p1);

        Department d = new DeptImpl();
        d.assignDepartment("Engineering");

        System.out.println("Department: " + d.getDepartmentDetails());
        // Polymorphism: Employee reference
        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
