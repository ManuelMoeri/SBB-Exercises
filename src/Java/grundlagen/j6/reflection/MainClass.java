package Java.grundlagen.j6.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public class MainClass {

    public static void main(String[] args) {
        Class<Person> clazz = Person.class;
        Constructor<Person> constructor;
        try {
            constructor = clazz.getConstructor(String.class, int.class);

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        PersonData annotation = constructor.getAnnotation(PersonData.class);
        String[] name = annotation.names();
        int[] age = annotation.ages();

        for (int i = 0; i < 3; i++) {
            System.out.println(name[i] + ", " + age[i]);
        }
    }
}