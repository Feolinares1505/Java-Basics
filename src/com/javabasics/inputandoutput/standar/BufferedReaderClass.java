package com.javabasics.inputandoutput.standar;

import java.io.*;

/**
 * En esta clase haremos uso de la entrada de datos entandar (Por consola)*/
public class BufferedReaderClass {
    public static void main(String[] args) {

        String reception;

        InputStreamReader input = new InputStreamReader(System.in); //Lee caracter por caracterM
        BufferedReader bInput = new BufferedReader(input); //Lee la linea completa

        try{
            System.out.println("Introduce un dato: ");
            reception = bInput.readLine();
            while (reception != null){
                System.out.println("Dato recepcionado: " + reception);
                reception = bInput.readLine();
            }
        }catch (IOException e){ //Este es el tipo de excepcion Input - Output Excepcion
            e.printStackTrace();
        }
    }
}
