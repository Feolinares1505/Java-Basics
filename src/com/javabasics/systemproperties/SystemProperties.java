package com.javabasics.systemproperties;

import java.util.*;

/**
 * En esta clase implemntamos el uso de las propiedades del sistema
 * tales como, OS, java version, entre otros según lo necesitemos*/
public class SystemProperties {
    public static void main(String[] args) {

        Properties properties = System.getProperties();

        Enumeration propertyNames = properties.propertyNames(); //La clase Enumeration nos va a permiti iterar cada uno de los elementos, pues el
        //metodo .propertyNames() nos va a regresar una enumeración

        //Mientras haya mas elementos ejecutará el siguiente ciclo
        while (propertyNames.hasMoreElements()){

            //Guardamos el nombre de cada propiedad en esta variable
            String propertyName = (String) propertyNames.nextElement();

            //Al ser el nombre la llave, haremos uso de ella para obtener su respectivo valor
            String propertyValue = properties.getProperty(propertyName);

            System.out.println("Llave: " + propertyName + "\n" + "Valor: " + propertyValue);
        }


    }

}
