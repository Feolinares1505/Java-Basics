package com.javabasics.exceptions;


/**
 * Al crear esta clase y que extienda de la clase Exception estamos definiendola como una excepción de tipo CheckException
 * Es decir que deberemos procesarla cando suceda*/
public class OperationException extends Exception {

    public OperationException(String message) {
        super(message); //Este constructor va a inicializar el atributo mensaje de la clase padre
    }

}
