package Java.grundlagen.j7.collections.set.lab2;

import Java.grundlagen.j7.collections.set.lab2.MySet;

public class MySetTest {

    public static void main(String[] args) {

        MySet<String> mySet = new MySet<>();

        mySet.add("Lmao");
        mySet.add("xd");
        mySet.add("idk");
        mySet.add("xd");
        mySet.remove("xd");
        mySet.contains("Lmao");
        mySet.contains("hehhehehaw");
        mySet.size();
        mySet.clear();
        System.out.println(mySet.toString());
    }
}
