package Java.grundlagen.j7.collections.list;

public class MyArrayListTest {
    public static void main(String[] args) {

        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("lmao");
        myArrayList.add("heheheehehehe");
        myArrayList.add("xd");
        myArrayList.add("HEHEHEHAW");
        myArrayList.add("idk");
        System.out.println("");
        myArrayList.isEmpty();
        System.out.println("");
        myArrayList.get(3);
        System.out.println("");
        myArrayList.size();
        System.out.println("");
        myArrayList.remove(3);
        System.out.println("");
        System.out.println(myArrayList.toString());
        System.out.println("");
        myArrayList.clear();
        System.out.println("");
        System.out.println(myArrayList.toString());
    }
}