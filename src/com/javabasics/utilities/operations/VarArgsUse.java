package com.javabasics.utilities.operations;

public class VarArgsUse {

    public void ImprimirNumeros(String text, int... numeros){
        int elemento;
        for(int i = 0; i < numeros.length; i++){
            elemento = numeros[i];
            System.out.println(text + elemento);
        }
    }
}
