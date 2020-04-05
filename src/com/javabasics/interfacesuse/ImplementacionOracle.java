package com.javabasics.interfacesuse;

import com.javabasics.exceptions.AccesoDatosEx;

public class ImplementacionOracle implements AccesoDatos {

    @Override
    public void insertar() throws AccesoDatosEx {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    }

    @Override
    public void simularError(boolean simularError) {

    }
}
