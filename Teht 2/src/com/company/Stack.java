package com.company;

import java.util.*;

public class Stack {
    
    private ListItem top;
    private int size;
    LinkedList<ListItem> list = new LinkedList<>();

    /**********************************************************/
    
    // Muodosta uusi lista-alkio ja vie se jonon viimeiseksi
    public void push(String aData){
        top = new ListItem();
        top.setData(aData);
        list.push(top);
        size++;
    }

    /**********************************************************/

    // Poista ja palauta alkio jonon edestä, jos jono tyhjä palauta null
    public ListItem pop(){
        if (size == 0) {
            return null;
        }
        top = list.get(size - 1);
        list.removeLast();
        size--;
        return top;
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
