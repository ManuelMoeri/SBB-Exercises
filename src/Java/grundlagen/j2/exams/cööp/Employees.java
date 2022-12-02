package Java.grundlagen.j2.exams.cööp;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    private String employeeName;
    private String employeeBirthDate;
    private String employeeGender;
    private String inWhichCompany;

    public Employees(String employeeName, String employeeBirthDate, String employeeGender, String inWhichCompany) {
        this.employeeName = employeeName;
        this.employeeBirthDate = employeeBirthDate;
        this.employeeGender = employeeGender;
        this.inWhichCompany = inWhichCompany;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeBirthDate() {
        return employeeBirthDate;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public String getInWhichCompany() {
        return inWhichCompany;
    }

    public static List<Employees> allEmployees = new ArrayList<>();

    public static void allEmployeesMethod() {
        allEmployees.add(new Employees("Jannik Pulfer", "12.12. 2000", "Male", "com1"));
        allEmployees.add(new Employees("Carina Lüscher", "7.2. 2000", "Female", "com3"));
        allEmployees.add(new Employees("Amelie Marx", "1.9. 2000", "Female", "com2"));
        allEmployees.add(new Employees("Basil Kocher", "24.4. 2000", "Male", "com3"));
        allEmployees.add(new Employees("Alex Alabor", "29.8. 2000", "Male", "com1"));
        allEmployees.add(new Employees("Lina Dubler", "15.11. 2000", "Female", "com2"));
    }
}
