package BasicSentences;

import java.util.*;

//Estructuras de modificacion de flujo de programa
//Condicionales if and switch

public class ConditionalIf {


    public static void main(String[] args) {
        //Condicional para evaluar la edad

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = entrada.nextInt();

        if(edad < 18){
            System.out.println("Eres un adolecente");
        }
        else if (edad < 40){
            System.out.println("Eres joven");
        }
        else if (edad < 65 ){
            System.out.println("Eres maduro");
        }
        else{
            System.out.println("Cuidate");
        }
    }
}
