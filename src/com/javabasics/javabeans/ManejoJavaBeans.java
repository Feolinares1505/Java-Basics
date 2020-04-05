package com.javabasics.javabeans;

public class ManejoJavaBeans {
    public static void main(String[] args) {
        PersonaBean bean = new PersonaBean();
        bean.setNombre("Miguel");
        bean.setEdad(18);

        System.out.println("Nombre: " + bean.getNombre());
        System.out.println("Edad: " + bean.getEdad());
    }
}
