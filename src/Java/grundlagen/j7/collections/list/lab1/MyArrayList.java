package Java.grundlagen.j7.collections.list.lab1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList<E> implements MyListInterfaceSimple<E> {

    private E[] content;
    private E[] bufferList;

    @Override
    public void add(E element) {
        if (content == null || content.length == 0) {
            content = (E[]) Array.newInstance(Object.class, 1);
            content[0] = element;
            System.out.println("The element " + "\"" + element + "\"" + " has been added");
        } else {

            bufferList = (E[]) Array.newInstance(Object.class, content.length);

            for (int i = 0; i < content.length; i++) {
                bufferList[i] = content[i];
            }

            content = (E[]) Array.newInstance(Object.class, bufferList.length + 1);

            for (int i = 0; i < bufferList.length; i++) {
                content[i] = bufferList[i];
            }

            content[content.length - 1] = element;
            System.out.println("The element " + "\"" + element + "\"" + " has been added");
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(content);
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        E result = content[index];
        try {
            System.out.println("The index " + index + " contains the object " + "\"" + result + "\"");
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
        return result;
    }

    @Override
    public E remove(int index) {
        E removedElement = content[index];
        try {
            bufferList = (E[]) Array.newInstance(Object.class, content.length -1);
            int counter = 0;
            for (int i = 0; i < content.length; i++) {
                if (i != index) {
                    bufferList[counter] = content[i];
                    counter++;
                }
            }

            content = (E[]) Array.newInstance(Object.class, bufferList.length);
            for (int i = 0; i < bufferList.length; i++) {
                content[i] = bufferList[i];
            }

            System.out.println("The object with the index " + index + " has been removed");

        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
        return removedElement;
    }

    @Override
    public int size() {
        if (content == null) {
            return 0;
        }
        return content.length;
    }

    @Override
    public boolean isEmpty() {
        if (content == null || content.length == 0) {
            System.out.println("The list is empty!");
            return true;
        } else {
            System.out.println("The list isn't empty!");
            return false;
        }
    }

    @Override
    public void clear() {
        content = (E[]) Array.newInstance(Object.class, 0);
        System.out.println("The list has been cleared!");
    }
}