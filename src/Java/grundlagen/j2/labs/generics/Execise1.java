package Java.grundlagen.j2.labs.generics;

public class Execise1 {
    public static<T> void test(T[] objectInput) {
        for(T t: objectInput) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static Integer[] intList = {1, 2, 4};
    public static String[] stringList = {"a", "b", "c"};
    public static Double[] doubleList = {1.4, 5.1, 8.7};

    public static void main(String[] args) {
        test(intList);
        test(stringList);
        test(doubleList);
    }
}