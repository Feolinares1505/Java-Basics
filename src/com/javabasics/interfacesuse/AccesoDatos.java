package com.javabasics.interfacesuse;

import com.javabasics.exceptions.AccesoDatosEx;

public interface AccesoDatos {
    public static int MAX_REGISTROS = 10;

    //Estamos indicado que estos metodos pueden generar alguna de las excepciones de tipo AccesoDatosEx, ya sean de clases hija mas especificas o del mismo tipo
    public abstract void insertar() throws AccesoDatosEx;
    public abstract void listar() throws AccesoDatosEx;
    public abstract void simularError(boolean simularError); //Este lo usaremos para activar o desactivar las excepciones, solo será para hacer la simulación
}
