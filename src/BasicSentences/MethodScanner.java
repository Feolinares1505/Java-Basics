package BasicSentences;

import java.util.Scanner;

public class MethodScanner {
    public static void main(String[] args) {
        //El metodo scanner sirve para guardar datos ingresados y la instrucción System.in quiere decir que lo que el metodo scanner debe guardar es información digitada mediante la consola
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre");

        //NextLine es una instruccion que define que aquello que debe guardar la variables es información de tipo String recibida mediante el metodo Scanner
        String name = entrada.nextLine();

        System.out.println("tu nombre es: " + name);

        //Existen más aparte del nextLine, dependiendo de nuestras necesidades y del tipo de dato que se desea guardar, Ej: nextInt, nextFloat, nextDouble, etc.
    }
}