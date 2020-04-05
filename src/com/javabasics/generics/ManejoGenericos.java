package com.javabasics.generics;

public class ManejoGenericos {
    public static void main(String[] args) {

        //No es posible usar tipos primitivo en una clase generica (ClaseGenerica<int> ejemplo = new ClaseGenerica<>(8);)
        //Lo anterior generaria un error de compilación
        ClaseGenerica<Integer> integerObject = new ClaseGenerica<>(10); //Los tipos pueden ser de cualquier clase que nosotros hayamos creado, en este caso usaremos la clase Integer
        ClaseGenerica<String> stringObject = new ClaseGenerica<>("Miguel");

        integerObject.obtenerTipo();
        stringObject.obtenerTipo();
    }
}
