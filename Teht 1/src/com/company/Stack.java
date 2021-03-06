package com.company;

public class Stack {

        ListItem top;
        private int size;

        public Stack() {
                top = null;
                size = 0;
        }

        public StackIterator iterator() {
            return new StackIterator(this);
        }

        // muodostetaan uusi alkio ja viedään se huipulle
        public void push(String aData) {
                ListItem newItem = new ListItem();
                newItem.setData(aData);
                newItem.setLink(top);
                top = newItem;
                size++;
        }

        // poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
        public ListItem pop() {
                ListItem takeAway;

                if (top == null) {
                        takeAway = null;
                } else {
                        size--;
                        takeAway = top;
                        top = top.getLink();
                }
                return takeAway;
        }

        // palautetaan pinottujen alkioiden lukumäärä
        public int getSize() {
                return size;
        }

        // listataan sisältö
        public void printItems() {
                ListItem item = top;
                while (item != null) {
                        System.out.print(item.getData()+"\n");
                        item = item.getLink();
                }

        }
}

