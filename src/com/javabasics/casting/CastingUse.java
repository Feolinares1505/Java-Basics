package com.javabasics.casting;

public class CastingUse {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Miguel", 870.000, TipoEscritura.MODERNA); //Aqui se hizo el upcasting

        imprimirDetalles(empleado);
    }

    public static void imprimirDetalles(Empleado empleado){
        String resultado = null;

        System.out.println("\nDetalle: " + empleado.obtenerDetalles());

        if (empleado instanceof Escritor){

            Escritor escritor = (Escritor) empleado;

            resultado = escritor.getTipoDeEscrituraEnTexto();

            resultado = ((Escritor) empleado).getTipoDeEscrituraEnTexto();

            System.out.println("Resultado tipo de escritura: " + resultado);

        }else if (empleado instanceof Gerente){

            resultado = ((Gerente) empleado).getDepartamento();

            System.out.println("Departamento: " + ((Gerente) empleado).getDepartamento());
        }
    }
}
