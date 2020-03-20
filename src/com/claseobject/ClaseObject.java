package com.claseobject;

import com.casting.Empleado;

public class ClaseObject {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Miguel", 876000);
        Empleado emp2 = new Empleado("Angel", 3500000);

        compararObjetos(emp1, emp2);
    }
    private static void compararObjetos(Empleado emp1, Empleado emp2){
        System.out.println("Contenido del objeto" + emp1);
    }
}
