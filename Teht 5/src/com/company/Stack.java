package com.company;

import java.util.Arrays;

public class Stack {

        static final int MAX = 10;
         int top;
        ListItem[] array = new ListItem[MAX];
        private int size;

       /* public Stack() {
                top = 0;
                size = 0;
        }*/

        //  palautetaan pino-iteraattori
        public StackIterator iterator() {
            return new StackIterator(this);
        }

        // muodostetaan uusi alkio ja viedään se huipulle
        public boolean push(String item)
        {
                if (top >= (MAX - 1)) {
                        System.out.println("Stack Overflow");
                        return false;
                }
                else {
                        ListItem listItem = new ListItem();
                        listItem.setData(item);
                        array[top++] = listItem;
                        System.out.println(listItem.getData() + " pushed into stack");
                        size++;
                        return true;
                }
        }

        // poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
        public ListItem pop() {
                if (top < 0) {
                        System.out.println("Stack Underflow");
                        return null;
                }
                else {
                        size--;
                        return array[top--];
                }
        }

        // palautetaan pinottujen alkioiden lukumäärä
        public int getSize() {
                return size;
        }

        // listataan sisältö
        public void printItems() {
                for (ListItem listItem : array) {
                        System.out.print(listItem.getData() + "\n");
                }
        }
}

