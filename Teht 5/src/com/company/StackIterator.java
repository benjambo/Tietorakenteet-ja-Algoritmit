package com.company;


interface Iterator {
    boolean hasNext();
    Object next();
}

public class StackIterator implements Iterator {
    private int current;
    private Stack container; // container on tietorakenne, jota iteroidaan

    StackIterator (Stack c) { // konstruktori on "package visible"
        container = c;
        current = container.top;
    }

    // palautetaan tieto siitä, löytyyko rakenteesta seuraava alkio
    public boolean hasNext() {
        return container.array[current] != null;
    }

    // palautetaan nykyinen (lista-alkio) ja siirretään nykypositiota pykälä eteenpäin
    public ListItem next() {
        int oldCurrent = current;
        current++;
        return container.array[oldCurrent];
    }

}

