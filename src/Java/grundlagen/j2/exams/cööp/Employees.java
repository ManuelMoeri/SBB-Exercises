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
}
