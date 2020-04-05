package com.javabasics.manejoexcepciones;

import com.javabasics.exceptions.AccesoDatosEx;
import com.javabasics.exceptions.LecturaDatosEx;
import com.javabasics.interfacesuse.AccesoDatos;
import com.javabasics.interfacesuse.ImplementacionMySql;

public class ManejoExcepciones2 {
    public static void main(String[] args) {

        AccesoDatos datos = new ImplementacionMySql();

        datos.simularError(true); //Cambiamos el estado del simulador de excepciones a true
        ejecutar2(datos, "Listar");

        datos.simularError(false);
        ejecutar2(datos, "Insertar");

    }

    private static void ejecutar2(AccesoDatos datos, String accion){
        if ("Listar".equals(accion)){
            try{
                datos.listar();
            }catch (LecturaDatosEx e){
                System.out.println("Error de lectura de datos, procesa una excepción mas especifica de lectura de datos");
            }catch (AccesoDatosEx e){
                System.out.println("Error de acceso a datos, procesa la excepcion mas generica de acceso a datos");
            }catch (Exception e){
                System.out.println("Error general");
            }finally {
                System.out.println("Jijijij este es el bloque finally"); //Cuando se esté trabajando con bases de datos es bueno usar el bloque finally, para terminar con los procesos abriertos durante la ejecución
            }
        }else if ("Insertar".equals(accion)){
            try{
                datos.insertar();
            }catch (AccesoDatosEx e){
                System.out.println("Error acceso datos: podemos procesar solo la excepcion mas generica"); //Si queremos
            }finally {
                System.out.println("Jijiji este es otro bloque finally");
            }
        }else{
            System.out.println("No se procesó ninguna acción conocida");//Esto en caso de que hayan seleccionado una opcion que no hayamos contemplado, como Delete o Update
        }
    }
}
