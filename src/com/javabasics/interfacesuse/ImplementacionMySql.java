package com.javabasics.interfacesuse;

import com.javabasics.exceptions.AccesoDatosEx;
import com.javabasics.exceptions.EscrituraDatosEx;
import com.javabasics.exceptions.LecturaDatosEx;

public class ImplementacionMySql implements AccesoDatos {

    private boolean simularError;

    public boolean isSimularError() {
        return simularError;
    }
    
    @Override
    public void insertar() throws AccesoDatosEx {
        if (simularError){
            throw new EscrituraDatosEx("Error de escritura de datos");
        }else {
            System.out.println("Insertar desde MySql");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx{
        if (simularError){
            throw new LecturaDatosEx("Error al listar los datos");
        }else {
            System.out.println("Listar desde MySql");
        }
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }
}