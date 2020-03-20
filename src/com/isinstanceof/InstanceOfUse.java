package com.isinstanceof;

public class InstanceOfUse {
    public static void main(String[] args) {
        FiguraGeometrica figure;
        figure = new Elipse();

        determinarTipo(figure);

        System.out.println("\nTodos los tipos: ");
        determinarTodosLosTipos(figure);
    }

    private static void determinarTodosLosTipos(FiguraGeometrica figure){
        if (figure instanceof Elipse){
            System.out.println("Es una elipse");
        }
        if (figure instanceof Circulo){
            System.out.println("Es un circulo");
        }
        if (figure instanceof FiguraGeometrica){
            System.out.println("Es una figura geometrica");
        }
        if (figure instanceof Object){
            System.out.println("Es un objeto");
        }else{
            System.out.println("No se encontró el tipo");
        }
    }

    private static void determinarTipo(FiguraGeometrica figure){
        if (figure instanceof Elipse){
            System.out.println("Es una elipse");
        }else if (figure instanceof Circulo){
            System.out.println("Es un circulo");
        }else if (figure instanceof FiguraGeometrica){
            System.out.println("Es una figura geometrica");
        }else if (figure instanceof Object){
            System.out.println("Es un objeto");
        }else{
            System.out.println("No se encontró el tipo");
        }
    }
}
