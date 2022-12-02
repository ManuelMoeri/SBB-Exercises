package Java.grundlagen.j2.labs.generics;

import java.util.ArrayList;
import java.util.List;

class NumberList<T> {
    private List<T> allNumbers;

    public NumberList(List<T> allNumbers) {
        this.allNumbers = allNumbers;
    }

    public List<T> getAllNumbers() {
        return allNumbers;
    }

    public static <T> void streamMethod(List<T> streamList) {
        List<T> sortedList = streamList.stream()
                .sorted()
                .toList();
        System.out.println("Smallest number: " + sortedList.get(0));
        System.out.println("Biggest number: " + sortedList.get(sortedList.size()-1));
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();

        intList.add(34);
        intList.add(2);
        intList.add(83);
        doubleList.add(4.23);
        doubleList.add(89.49);
        doubleList.add(68.34);

        streamMethod(intList);
        streamMethod(doubleList);
    }
}