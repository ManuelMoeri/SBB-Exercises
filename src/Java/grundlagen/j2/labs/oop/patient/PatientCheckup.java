package Java.grundlagen.j2.labs.oop.patient;

public class PatientCheckup {
    private String name;
    private int age;
    private float size;
    private float bodyTemperature;
    private String vaccinated;


    public PatientCheckup(String name, int age, float size, float bodyTemperature, String vaccinated) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.bodyTemperature = bodyTemperature;
        this.vaccinated = vaccinated;
    }

    public String getName() {
        return name;
    }

    public float getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public float getBodyTemperature() {
        return bodyTemperature;
    }

    public String getVaccinated() {
        return vaccinated;
    }
}
