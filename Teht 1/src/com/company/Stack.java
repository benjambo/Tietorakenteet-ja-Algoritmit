package com.company;

import java.util.*;

public class Stack {
    
    private ListItem top;
    private int size;
    LinkedList<ListItem> list = new LinkedList<>();

    /**********************************************************/
    
    // Muodosta uusi lista-alkio ja vie se pinon huipulle
    public void push(String aData){
        top = new ListItem();
        top.setData(aData);
        list.add(top);
        size++;
    }

    /**********************************************************/

    // Poista ja palauta alkio pinon huipulta, jos pino tyhjä palauta null
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

    // Tulosta pinon sisältö muuttamatta pinoa
    public void printItems() {
        if (size == 0) {
            System.out.println("Tyhjä pino");
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
