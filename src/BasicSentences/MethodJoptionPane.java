package BasicSentences;

import javax.swing.*;

public class MethodJoptionPane {
    public static void main(String[] args) {
        //JOptionPane se usa para la recepcion y muestra de datos en forma de ventanas
        String name = JOptionPane.showInputDialog("Ingrese su nombre por favor.");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        System.out.println(age+ " " +name);
    }
}
