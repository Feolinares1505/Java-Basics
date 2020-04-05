package com.javabasics;

import com.javabasics.enumclass.Dias;
import com.javabasics.enumclass.DiasUse;
import com.javabasics.threads.SecondProcess;
import com.javabasics.utilities.operations.VarArgsUse;
import com.javabasics.utilities.text.StringBuilder;
import com.javabasics.utilities.text.TextColor;

import java.util.Arrays;

public class App {
    /**
     * En este metodo realizaremos la ejecución de todo aquello aprendido en el transcurso de la creación del proyecto,
     * hasta este momento
     * @param args Este metodo recibe un parametro de tipo args (De la linea de comandos)
     * */
    public static void main(String[] args) {

        String[] values = {"Mandarina", "Hierba", "Saltamontes", "Sábanas", "Cielo", "Tomate"};
        VarArgsUse varArgs1 = new VarArgsUse();

        TextColor text = new TextColor();
        StringBuilder info = new StringBuilder();
        Thread translate = new Thread(new SecondProcess());

        text.ShowTextWithColor(values);

        info.ShowInfo();

        translate.start();

        varArgs1.ImprimirNumeros("Este es tu numero: ",1,4,2,6,4,8); //Uso de los argumentos variable

        DiasUse dia1 = new DiasUse(Dias.MARTES); //Para acceder a los atributos de cada pais es necesario hacer uso de sus metodos get, siguiendo esta estructura(NombreDeLaCLaseEnum.VALORDECONSTANTE.MetodoGetAUtilizar);
        System.out.println(Dias.JUEVES.getHours()); //Este es un claro ejemplo para el uso y llamado de los atributos pertenecientes a esta constante
        dia1.HorasDeTrabajoAlDia();
        System.out.println(Arrays.toString(Dias.values())); //Esta linea nos permite ver los valores de la clase enum
    }
}