package Java.grundlagen.j2.labs.oop.addressbook;

public class Person {

    private String email;
    private String name;
    private String phoneNumber;


    public Person (String email, String name, String phoneNumber) {
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {return email;}
    public String getName() {return name;}
    public String getPhoneNumber() {return phoneNumber;}
}
