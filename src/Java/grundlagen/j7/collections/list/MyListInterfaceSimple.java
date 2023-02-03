package Java.grundlagen.j7.collections.list;

public interface MyListInterfaceSimple<E> {

    void add(E element);

    E get(int index) throws IndexOutOfBoundsException;

    E remove(int index) throws IndexOutOfBoundsException;

    int size();

    boolean isEmpty();

    void clear();
}
