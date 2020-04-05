package com.javabasics.collections;

import java.util.*;

public class ManejoColecciones {
    public static void main(String[] args) {

        //Las variables son del tipo de la interfaz y los objetos, de la clase que la implementa respectivamente
        List miLista = new ArrayList();

        miLista.add("Miguel");
        miLista.add("Yeison");
        miLista.add("Adriana");
        miLista.add("Angel");

        //Permite elementos repetidos
        miLista.add("Angel");

        imprimir(miLista);

        Set miSet = new HashSet();

        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("400");
        miSet.add("500");


        //No permite elementos repetidos, por lo tanto en cuanto lo detecté, este será omitido
        miSet.add("200");

        imprimir(miSet);

        Map miMapa = new HashMap();

        //Uso del concepto de llave valor
        miMapa.put("1", "Miguel Angel");
        miMapa.put("2", "Feo Linares");

        imprimir(miMapa.keySet()); //El metodo keySet() nos devuelve todas las llaves existentes para así poder iterarlas y extraer sus valores

        imprimir(miMapa.values()); //Tambien es posible imprimir todos los "valores" no llaves, pues este metodo nos devuelve una lista de todos los valores

    }

    private static void imprimir(Collection collection){ //Resive un objeto de tipo collections pues está es la interfaz principal del API de colecctions
        for (Object o : collection){ //Iteramos cada objeto con la sentencia foreach
            System.out.println(o + " ");
        }
        System.out.println("");
    }
}
