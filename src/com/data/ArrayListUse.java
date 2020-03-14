package com.data;

import java.util.ArrayList;

public class ArrayListUse {

    public static ArrayList<StructureOfData> ShowTranslateValue(){

        ArrayList<StructureOfData> translate = new ArrayList<>();

        translate.add(new StructureOfData("Pan", "Bread"));
        translate.add(new StructureOfData("Agua", "Water"));
        translate.add(new StructureOfData("Mora", "Blackberry"));
        translate.add(new StructureOfData("Zapato", "Shoe"));
        translate.add(new StructureOfData("Dedo", "Finger"));
        translate.add(new StructureOfData("Anillo", "Ring"));
        translate.add(new StructureOfData("Telefono", "Phone"));
        translate.add(new StructureOfData("Hola", "Hi"));
        translate.add(new StructureOfData("Computador", "Computer"));
        translate.add(new StructureOfData("Sol", "Sun"));

        return translate;
    }
}
