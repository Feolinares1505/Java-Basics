package com.practice.words;

import java.util.ArrayList;

public class Translate {

    public void ShowTranslateValue(){

        ArrayList<Data> translate = new ArrayList<>();
        translate.add(new Data("Pan", "Bread"));
        translate.add(new Data("Agua", "Water"));
        translate.add(new Data("Mora", "Blackberry"));
        translate.add(new Data("Zapato", "Shoe"));
        translate.add(new Data("Dedo", "Finger"));
        translate.add(new Data("Anillo", "Ring"));
        translate.add(new Data("Telefono", "Phone"));
        translate.add(new Data("Hola", "Hi"));
        translate.add(new Data("Computador", "Computer"));
        translate.add(new Data("Sol", "Sun"));

        for (Data d: translate) {
            System.out.println(d.spanish + " : " + d.english);
        }
    }
}
