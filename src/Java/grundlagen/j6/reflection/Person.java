package Java.grundlagen.j6.reflection;

@PersonInstance
public class Person {

    private String name;
    private int age;

    @PersonData(names = {"Peter", "Hans", "Alfred"}, ages = {21, 34, 19})
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}