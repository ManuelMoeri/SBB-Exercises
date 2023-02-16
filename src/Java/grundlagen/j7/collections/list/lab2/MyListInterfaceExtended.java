package Java.grundlagen.j7.collections.list.lab2;

public interface MyListInterfaceExtended<E> {

    void add(E element);

    E get(int index) throws IndexOutOfBoundsException;

    E remove(int index) throws IndexOutOfBoundsException;

    int size();

    boolean isEmpty();

    void clear();

    void add(int index, E element) throws IndexOutOfBoundsException;

    boolean contains(Object o);

    int indexOf(Object o);

    E set(int index, E element) throws IndexOutOfBoundsException;

    boolean equals(Object o);

    boolean remove(Object o);
}
