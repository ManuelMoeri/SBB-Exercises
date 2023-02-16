package Java.grundlagen.j7.collections.list.lab2;

import Java.grundlagen.j7.collections.list.lab1.MyArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayListExtended<E> implements MyListInterfaceExtended<E> {


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
            throw e;
        }
        return result;
    }

    @Override
    public E remove(int index) {
        E removedElement = content[index];
        try {
            bufferList = (E[]) Array.newInstance(Object.class, content.length - 1);
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

    @Override
    public void add(int index, E element) throws IndexOutOfBoundsException {
        bufferList = content;
        content = (E[]) Array.newInstance(Object.class, bufferList.length + 1);

        for (int i = 0; i < bufferList.length; i++) {
            content[i] = bufferList[i];
        }

        try {
            if (content[index] == null) {
                content[index] = element;
            } else {
                int counter = index;
                for (int i = index; i < bufferList.length; i++) {
                    bufferList[i] = content[i];
                }
                content[index] = element;

                for (int i = (index +1); i < content.length; i++) {
                    content[i] = bufferList[counter];
                    counter++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < content.length; i++) {
            if (content[i].equals(o)) {
                return true;
            } else {
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object o) {
        int counter = -1;
        for (int i = 0; i < content.length; i++) {
            if(content[i].equals(o)) {
                counter = i;
                return counter;
            }
        }
        System.out.println("The index of your element is " + counter);
        return counter;
    }

    @Override
    public E set(int index, E element) throws IndexOutOfBoundsException {
        E previousElement = content[index];
        try {
            content[index] = element;
            System.out.println("The element with the index " + "\"" + index + "\"" + " has been set to " + "\"" + element + "\"");
        } catch (IndexOutOfBoundsException e) {
            throw e;
        }
        return previousElement;
    }

    @Override
    public boolean equals(Object o) {
        if (!o.getClass().equals(MyArrayList.class)) {
            return false;
        }

        if (((MyArrayList<?>) o).size() != content.length) {
            return false;
        }

        for (int i = 0; i < content.length; i++) {
            if (((MyArrayList<?>) o).get(i) != content[i]) {
                return false;
            }
        }
        System.out.println("The item \"o\" equals!");
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int counter = -1;
        int indexOfO = 0;
        for (int i = 0; i < content.length; i++) {
            counter++;
            if (content[i].equals(o)) {
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

        System.out.println("The object " + "\"" + o + "\"" + " has been removed");
        return false;
    }
}