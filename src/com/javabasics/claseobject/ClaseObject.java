package com.javabasics.claseobject;

import com.javabasics.casting.Empleado;

public class ClaseObject {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Miguel", 1);
        Empleado emp2 = new Empleado("Miguel", 1);

        compararObjetos(emp1, emp2);
    }
    private static void compararObjetos(Empleado emp1, Empleado emp2){

        if(emp1 == emp2){
            System.out.println("La referencia de ambas variables es la misma en memoria");
        }else{
            System.out.println("La referencia en memoria de ambas variables es distinta");
        }

        if (emp1.equals(emp2)){
            System.out.println("Ambos objetos tienen el mismo contenido, es decir: 'Son iguales'");
        }else {
            System.out.println("Los objeto son distintos");
        }

        if (emp1.hashCode() == emp2.hashCode()){
            System.out.println("El hash code de ambos objetos es igual");
        }else {
            System.out.println("EL hash code de ambos objetos es diferente");
        }
    }
}