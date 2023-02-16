package Java.grundlagen.j7.collections.list.lab2;

import Java.grundlagen.j7.collections.list.lab1.MyArrayList;
import Java.grundlagen.j7.collections.list.lab2.MyArrayListExtended;

public class MyArrayListExtendedTest {

    public static void main(String[] args) {
        MyArrayListExtended<String> myArrayListExtended = new MyArrayListExtended();

        myArrayListExtended.add("Test1");
        myArrayListExtended.add("Test2");
        myArrayListExtended.add("Test3");
        myArrayListExtended.add("Test4");
        System.out.println("");
        myArrayListExtended.size();
        System.out.println("");
        myArrayListExtended.indexOf("Test2");
        myArrayListExtended.contains("Test4");
        myArrayListExtended.set(2, "Test99");
        System.out.println("");
        myArrayListExtended.remove("Test1");
        myArrayListExtended.equals(MyArrayList.class);
        System.out.println(myArrayListExtended.toString());

    }
}