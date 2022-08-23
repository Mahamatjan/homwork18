package com.company;

public class Obshaga implements Arenda {
    private Person[] uiBuloo;

    public Obshaga(Person[] uiBuloo) {
        this.uiBuloo = uiBuloo;
    }

    @Override
    public void arendaToloo() {
        System.out.println("Hoteldegiler arenda toloit");

    }

    public Person[] getUiBuloo() {
        System.out.println("Obshagada jashagan adamdar");
        for (Person i : uiBuloo) {

        }
        return uiBuloo;

    }

}
