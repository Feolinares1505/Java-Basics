package com.javabasics.threads.utilities;

import java.util.ArrayList;

/**
 * Esta clase fue creada con el fin de poner en practica el uso de los ArrayList
 * @author Miguel Feo
 * @version 1.0
 */
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
