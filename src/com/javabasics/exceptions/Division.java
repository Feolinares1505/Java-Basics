package com.javabasics.exceptions;

public class Division {

    private int numerador;
    private int denominador;

    //Throws se usa para definir el tipo de excepción que la clase puede generar
    public Division(int numerador, int denominador) throws OperationException{
        //Si el denominador es igual a cero se generá la excepcion puesto que una division con denonimador 0 es invalida
        if (denominador == 0){
            /*Aqui le estamos diciendo que cree una nueva excepcion, con un nuevo objeto de la clase que definimos para
            dicha excepción
            Tambien es posible usar la excepcion throw new IllegalArgumentException("Denominador igual a cero");
            la cual nos indica que alguno de los argumentos es invalido*/
            throw new OperationException("Denominador igual a cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Este metodo nos devuelve el resultado de la división*/
    public void visualizarOperacion(){
        System.out.println("El resultado es: " + numerador/denominador);
    }
}
