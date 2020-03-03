package BasicSentences;
import java.util.*;
import javax.swing.*;

public class ConditionalSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opcion: \n1: Cuadrado \n2:rectangulo \n3: Triangulo \n4: Circulo");
        int figura = entrada.nextInt();

        switch (figura ){
            case 1:
                int lado =Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadro"));

                System.out.println("El area del cuadrado es: "+ Math.pow(lado, 2));

            break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del Rectangulo"));

                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del Rectangulo"));

                System.out.println("El area del rectangulo es: "+ base * altura);
             break;

            case 3 :
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triangulo"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triangulo"));

                System.out.println("El area del triangulo es: "+ (base * altura)/2);
            break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));

                System.out.print("El area del circulo es: ");
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio,2)));

                break;
        }
    }

}
