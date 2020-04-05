package com.javabasics.generics;

import java.util.*;

public class ManejoColeccionesGenericas {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();
        Map<Integer, String> keyMap = new HashMap<>();

        intList.add(12);
        intList.add(11);
        intList.add(18);
        intList.add(16);


        stringSet.add("Hola");
        stringSet.add(", esto");
        stringSet.add(" es");
        stringSet.add(" un");
        stringSet.add(" set de tipo");
        stringSet.add(" generic");

        keyMap.put(1, "Uno");
        keyMap.put(2, "Dos");
        keyMap.put(3, "Tres");
        keyMap.put(4, "Cuatro");
        keyMap.put(5, "Cinco");

        imprimir(intList);
        imprimirWithGenericTypeDefined(stringSet);
        imprimir(keyMap.keySet()); //Para poder iterar un tipo HAshMap es necesario declarar que dato es el que deseamos, si la llave o el valor
        imprimir(keyMap.values());
    }

    //Este metodo iterara el valor recibido, independientemente de el T (Tipo con el que hayan sido definidos)
    private static void imprimir(Collection collection){ //Resive un objeto de tipo collections pues está es la interfaz principal del API de colecctions
        for (Object o : collection){ //Iteramos cada objeto con la sentencia foreach
            System.out.print(o + " ");
        }
        System.out.println("");
    }

    //Este metodo por el contrario solo podrá iterar objetos cuyo tipo generico sea String
    private static void imprimirWithGenericTypeDefined(Collection<String> collection){ //Resive un objeto de tipo collections pues está es la interfaz principal del API de colecctions
        StringBuilder value = new StringBuilder();
        for (String o : collection){ //Iteramos cada objeto con la sentencia foreach
            value.append(o);
        }
        System.out.println(value); //La razón por la que este Set se imprime en desorden es porque Set no es una lista de tipo ordenanda sino Desordenada
    }
}
