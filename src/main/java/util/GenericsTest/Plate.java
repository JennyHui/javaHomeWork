package util.GenericsTest;

class Plate<T> {

    private T item;

    Plate(T item) {
        this.item = item;
    }

    T get() {
        return item;
    }

    void set(T item) {
        this.item = item;
    }
}
