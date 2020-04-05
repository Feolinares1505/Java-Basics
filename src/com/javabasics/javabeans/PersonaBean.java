package com.javabasics.javabeans;


/**
 * Esta clase puede ser enviada a traves de la red*/
public class PersonaBean {
    private String nombre;
    private int edad;

    //Un java bean siempre debe tener un constructor vacio, si no existe ningún otro, el compilador lo agregara de forma automatica
    public PersonaBean(){

    }

    /*Este constructor no será obligatoria si no lo necesitamos, pero en caso de que necesitasemos uno es bueno recordar que,
    si se define uno con atributos, tambien deberá ser creado el vacio*/
    public PersonaBean(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
