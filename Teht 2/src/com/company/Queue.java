package com.company;

import java.util.*;

public class Queue {
    
    private ListItem head;
    private ListItem tail;
    private int size;
    LinkedList<ListItem> list = new LinkedList<>();

    /**********************************************************/
    
    // Muodosta uusi lista-alkio ja vie se jonon viimeiseksi
    public void push(String aData){
        tail = new ListItem();
        tail.setData(aData);
        list.push(tail);
        size++;
    }

    /**********************************************************/

    // Poista ja palauta alkio jonon edestä, jos jono tyhjä palauta null
    public ListItem pop(){
        if (size == 0) {
            return null;
        }
        head = new ListItem();
        head = list.get(size - 1);
        list.removeLast();
        size--;
        return head;
    }

    /**********************************************************/

    // Tulosta jonon sisältö muuttamatta jonoa
    public void printItems() {
        if (size == 0) {
            System.out.println("Tyhjä jono");
        }

       for (ListItem item : list) {
           System.out.println(item.getData());
        }
    }

    /**********************************************************/

    public int getSize() {
        return size;
    }
}
