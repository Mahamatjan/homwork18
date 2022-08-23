package com.company;

public  class Hotel implements Arenda {
    private Person[] uiBuloo;

    public Hotel(Person[]uiBuloo){
        this.uiBuloo = uiBuloo;

    }

    @Override
    public void arendaToloo(){
        System.out.println("Hoteldegiler arenda toloit");

    }

    public Person[] getUiBuloo() {
        System.out.println("Otelde jashagan adamdar");
        for (Person i :uiBuloo) {
            i.getName();

        }
        return uiBuloo;
    }


}
