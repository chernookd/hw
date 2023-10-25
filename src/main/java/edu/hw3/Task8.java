package edu.hw3;

import java.util.Iterator;
import java.util.List;

public class Task8<T> implements Iterator<T> {
    private final List<T> collection;

    private int currentIndex;

    public Task8(List<T> collection) {
        this.collection = collection;
        this.currentIndex = collection.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public T next() {
        return collection.get(currentIndex--);
    }
}
