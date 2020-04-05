package com.javabasics.enumclass;

/**
 * Esta clase de tipo enum nos permite crear un listado de constantes con una tematica en común, que podrán ser llamadas mas adelnate
 * Cada opción de tipo enum puede o no contener atributos particulares para cada
 */

public enum Dias {
    LUNES(6),
    MARTES(6),
    MIERCOLES(6),
    JUEVES(6),
    VIERNES(6),
    SABADO(0),
    DOMINGO(0);

    private final int hours;

    /**
     * Este constructor sirve para inicializar los atributos
     * @param hours
     */
    Dias(int hours){
        this.hours = hours;
    }

    public int getHours(){
        return hours;
    }
}
