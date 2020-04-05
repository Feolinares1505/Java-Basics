package com.javabasics.inputandoutput.standar;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {

        boolean restart;
        String response;
        do {
            try{
                restart = false;
                System.out.println("Introduce el primer valor: ");
                Scanner scan1 = new Scanner(System.in);
                Integer firstValue = scan1.nextInt();

                System.out.println("Introduce el segundo valor: ");
                Scanner scan2 = new Scanner(System.in);
                Integer secondValue = scan2.nextInt();

                System.out.println("El resultado de la operación es: " + (firstValue+secondValue));

            }catch (Exception e){
                System.out.println("¡Formato invalido!, debes otorgar un valor numerico entero, ¿deseas intentarlo nuevamente?");
                Scanner again = new Scanner(System.in);

                response = again.nextLine();

                if (response.equals("si")){
                    restart = true;
                }else{
                    restart = false;
                }
            }
        }while (restart);

    }
}
