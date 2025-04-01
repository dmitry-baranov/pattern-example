package com.dmitrii.behaviour.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class EvenNumberIterator implements Iterator<Integer> {

    private final List<Integer> list;

    private int currentIndex = 0;

    public EvenNumberIterator(List<Integer> list) {
        this.list = list;
        advanceToNextEven();
    }

    private void advanceToNextEven() {
        while(currentIndex < list.size() && list.get(currentIndex) % 2 != 0){
            currentIndex++;
        }
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        int value = list.get(currentIndex++);
        advanceToNextEven();
        return value;
    }
}
