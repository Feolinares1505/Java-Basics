package com.javabasics.casting;

public class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String obtenerDetalles(){
        return "Nombre: " + nombre + "Sueldo: " + sueldo;
    }

    @Override
    public String toString(){
        return "Empleado{Nombre: " + nombre + "Sueldo: " + sueldo + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            return false;
        }else if (o instanceof Empleado){
            Empleado emp = (Empleado) o;
            if (nombre.equals(emp.nombre) && Double.valueOf(sueldo).equals(emp.sueldo)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.nombre.hashCode();
        hash = 31 * hash + Double.valueOf(this.sueldo).hashCode();

        return hash;
    }
}
