package com.company;

interface Iterator {
    boolean hasNext();
    Object next();
}

public class StackIterator implements Iterator {
    private ListItem current;

    StackIterator (Stack c) {
        current = c.top;
    }

    public boolean hasNext() {
        return current != null;
    }

    public ListItem next() {
        ListItem oldCurrent = current;
        current=current.getLink();
        return oldCurrent;
    }

}

