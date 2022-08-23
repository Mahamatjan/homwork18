package com.company;

public class Kvartira implements komUsluga {
    private Person[] uiBuloo;

    public Kvartira(Person[] uiBuloo) {
        this.uiBuloo = uiBuloo;
    }
    @Override
    public void komUsluga(){
        System.out.println("Kvartirada kom usluga toloit");
    }

    public Person[] getUiBuloo() {
        System.out.println("Ui buloodo bir kancha adamdar jashait");
        for (Person i:uiBuloo) {
            i.getName();

        }
        return uiBuloo;

    }
}
