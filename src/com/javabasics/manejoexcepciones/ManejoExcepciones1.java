package com.javabasics.manejoexcepciones;

import com.javabasics.exceptions.Division;
import com.javabasics.exceptions.OperationException;

public class ManejoExcepciones1 {
    public static void main(String[] args) {
        /*Como vamos a realizar la creación de un objeto de tipo División, el compilador nos obligará a procesar la excepción de tipo
        OperationException, ya sea declarandola dentro del metodo main que la va a arrojar o utilizando un bloque try - catch
        Si la excepcion que podria generarse fuera de tipo uncheckexception no seria necesario procesar la excepción*/
        try{
            Division division = new Division(8, 0);
            division.visualizarOperacion();
        }catch (OperationException e){ //Indicamos cual es la posible excepcion que se va a arrojar y la guardamos en una variable
            System.out.println("Ha habido una excepción");
            e.printStackTrace(); //El stackTrace es la pila de errores que se va acumulando desde la primer clase que mando el error hasta la ultima clase que lo proceso
        }
    }
}
