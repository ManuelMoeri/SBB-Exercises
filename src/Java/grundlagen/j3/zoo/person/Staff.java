package Java.grundlagen.j3.zoo.person;

import Java.grundlagen.j3.zoo.person.Person;

public class Staff extends Person {
    private int salary;
    private String jobDescription;

    public Staff(String name, String gender, String phoneNumber, int salary, String jobDescription) {
        super(name, gender, phoneNumber);
        this.salary = salary;
        this.jobDescription = jobDescription;
    }

    public static void main(String[] args) {
        Staff staff1 = new Staff("Max mustermann", "Male", "079 932 87 34", 4000, "He is responsable to feed all Animals that require meat");
    }
}
