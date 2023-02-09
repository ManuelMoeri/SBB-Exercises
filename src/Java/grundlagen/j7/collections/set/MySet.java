package Java.grundlagen.j7.collections.set;

public class MySet<E> implements MySetInterfaceSimple<E> {
    @Override
    public boolean add(E element) {
        return false;
    }

    @Override
    public boolean remove(Object object) {
        return false;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
