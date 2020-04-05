package com.javabasics.casting;

public class Escritor extends Empleado {

    final TipoEscritura tipoEscritura;

    protected Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    public String obtenerDetalles() {
        return super.obtenerDetalles() + "Tipo de escritura: " + tipoEscritura.getDescription();
    }

    public String getTipoDeEscrituraEnTexto(){
        return tipoEscritura.getDescription();
    }
}
