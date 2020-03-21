package com.company;

public class Stack {
    
    private ListItem top;
    private int size;

    
    // muodosta uusi lista-alkio ja vie se pinon huipulle
    public void push(String aData){
        top = new ListItem();

    }

    // poista ja palauta alkio pinon huipulta, 
    // jos pino tyhjä palauta null
    public ListItem pop(){
        
        return null;
    }
    // tulosta pinon sisältö muuttamatta pinoa
    public void printItems() {
        
    }

    public int getSize() {
        return size;
    }
    
}
