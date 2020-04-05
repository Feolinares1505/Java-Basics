package com.javabasics.generics;


//Para definir una clase como generica hacemos uso de el operador diamante "<>"
//AL estar definiendo un tipo de una clase generica usamos la T (Type - Class)
public class ClaseGenerica<T> {

    //Definimos un atributo de tipo generico
    T object;

    public ClaseGenerica(T object) {
        this.object = object;
    }

    public void obtenerTipo(){
        //En esta linea lo que hacemos es utilizar el metodo getClass para saber a que tipo o clase pertenece, ya que cabe recordar que los tipo son en realidad clases genericas
        System.out.println("El tipo del generico es: " + object.getClass().getName());
        System.out.println("Uso solo del metodo getClass: " + object.getClass());
    }
}
