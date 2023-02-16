package Java.grundlagen.j7.collections.set.lab2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MySet<E> implements MySetInterfaceSimple<E> {

    private E[] content = (E[]) Array.newInstance(Object.class, 0);
    private E[] bufferList;

    @Override
    public boolean add(E element) {

        boolean alreadyInSet = false;

        for (int i = 0; i < content.length; i++) {
            if (content[i].equals(element)) {
                alreadyInSet = true;
                break;
            } else {
                alreadyInSet = false;
            }
        }

        if (alreadyInSet) {
            System.out.println("This element is already in the set!");
            return true;
        } else {

            bufferList = content;

            content = (E[]) Array.newInstance(Object.class, bufferList.length + 1);

            for (int i = 0; i < bufferList.length; i++) {
                content[i] = bufferList[i];
            }

            content[content.length - 1] = element;
            System.out.println("The element " + "\"" + element + "\"" + " has been added");
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {

        boolean inSet = false;

        for (int i = 0; i < content.length; i++) {
            if (content[i].equals(object)) {
                inSet = true;
                break;
            } else {
                inSet = false;
            }
        }

        if (inSet) {
            int counter = -1;
            int indexOfO = 0;
            for (int i = 0; i < content.length; i++) {
                counter++;
                if (content[i].equals(object)) {
                    indexOfO = counter;
                }
            }

            bufferList = (E[]) Array.newInstance(Object.class, content.length - 1);
            int counter1 = 0;
            for (int i = 0; i < content.length; i++) {
                if (i != indexOfO) {
                    bufferList[counter1] = content[i];
                    counter1++;
                }
            }

            content = (E[]) Array.newInstance(Object.class, bufferList.length);
            for (int i = 0; i < bufferList.length; i++) {
                content[i] = bufferList[i];
            }

            System.out.println("The object " + "\"" + object + "\"" + " has been removed");
            return true;
        } else {
            System.out.println("This object is not in the set!");
            return false;
        }

    }

    @Override
    public String toString() {
        return Arrays.toString(content);
    }

    @Override
    public boolean contains(Object object) {
        for (int i = 0; i < content.length; i++) {
            if (content[i].equals(object)) {
                System.out.println("The object " + "\"" + object + "\"" + " is in the set!");
                return true;
            }
        }
        System.out.println("The object " + "\"" + object + "\"" + " isn't in the set!");
        return false;
    }

    @Override
    public int size() {
        int size = content.length;
        System.out.println("The size of the set is " + size);
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (content == null || content.length == 0) {
            System.out.println("The set is empty!");
            return true;
        } else {
            System.out.println("The set isn't empty!");
            return false;
        }
    }

    @Override
    public void clear() {
        content = (E[]) Array.newInstance(Object.class, 0);
        System.out.println("The set has been cleared!");
    }
}
