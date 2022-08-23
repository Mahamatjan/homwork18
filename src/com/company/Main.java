package com.company;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("MAHAMATJAN");
        Person person2 = new Person("AZIMBEK");
        Person person3 = new Person("ULUKBEK");
        Person person4 = new Person("SYIMUK");
        Person person5 = new Person("AZA");
        Person person6 = new Person("SASHA");
        Person person7 = new Person("BAHA");
        Person person8 = new Person("OROZ baike");
        Person person9 = new Person("BAKAI baike");
        Person person10 = new Person("SANJAR");
        Person[] uiBuloo1 = {person1,person4,person10};
        Person[] uiBuloo2 = {person8,person6,person2};
        Person[] uiBuloo3 = {person9,person7,person5,person3};

        Kvartira kvartira = new Kvartira(uiBuloo1);
        Hotel hotel = new Hotel(uiBuloo2);
        Obshaga obshaga = new Obshaga(uiBuloo3);

        kvartira.getUiBuloo();
        kvartira.komUsluga();
        hotel.arendaToloo();
        hotel.getUiBuloo();
        obshaga.arendaToloo();
        obshaga.getUiBuloo();


    }
}