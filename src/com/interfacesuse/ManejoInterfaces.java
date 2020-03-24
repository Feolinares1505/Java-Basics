package com.interfacesuse;

import com.exceptions.AccesoDatosEx;

public class ManejoInterfaces {
    public static void main(String[] args) throws AccesoDatosEx {
        AccesoDatos datos = new ImplementacionOracle();
        ejecutar(datos, "Listar");

        datos = new ImplementacionMySql();
        ejecutar(datos, "Insertar");
    }
    private static void ejecutar(AccesoDatos datos, String accion) throws AccesoDatosEx {
        if ("Listar".equals(accion)){
            datos.listar();
        }else if("Insertar".equals(accion)){
            datos.insertar();
        }
    }
}
