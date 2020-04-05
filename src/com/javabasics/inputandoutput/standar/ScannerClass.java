package com.javabasics.inputandoutput.standar;

import java.util.*;

/**
 * En esta clase haremos uso de Scanner la cual es una otra clase que nos facilita la recepción de datos a diferencia de
 * BufferedReader*/
public class ScannerClass {
    public static void main(String[] args) {

        String reception = null;

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un valor: ");
        reception = scan.nextLine(); //Guardamos nuestro valor recibido desde la consola, a la variable reception

        while (reception != null){
            System.out.println("Dato introducido: " + reception);
            reception = scan.nextLine();
        }
    }
}
