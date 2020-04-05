package com.javabasics.manejoexcepciones;

import com.javabasics.exceptions.Division;
import com.javabasics.exceptions.OperationException;

public class ManejoExcepcionesArg {

    //Esta es la forma alternativa de procesar una excepcion, le indicamamos al compilador que esta clase podria arrojar una excepcion al hacer uso de la clase Division
    public static void main(String[] args) throws OperationException {
        try{
            //Aqui estamos haciendo uso de el arreglo de argumentos que recibe como parametro el metodo main
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);

            Division division = new Division(op1, op2);
            division.visualizarOperacion();
        }catch (ArrayIndexOutOfBoundsException e){ //En vez de llamar la excepcion de tipo OperationEception llamamos esta la cual no puede indicar que, si no es proporcionado cada uno de los valores que necesitamos estariamos haciendo el llamado de un indice que no existe
            System.out.println("Ocurrio una excepcion: ");
            System.out.println("Hubo un error al acceder un indice fuera de rango");
            e.printStackTrace();
        }catch (NumberFormatException e){ //Al transformar un indice del arreglo cabe la posibilidad de que no sea compatible, es decir, podria venir una letra o caracter incorrecto, por ende llamamos la excepcion de Formato numerico incorrecto
            System.out.println("Ocurrio una excepcion: ");
            System.out.println("Uno de los argumentos no es de tipo Integer");
            e.printStackTrace();
        }catch (OperationException e){ //Finalmente le indicamos que es posible recibir una excepcion de tipo OperationException
            System.out.println("Ocurrio una excepcion: ");
            System.out.println("Se trató de realizar una operación erronea");
            e.printStackTrace();
        }finally { //Este bloque siempre se va a ejecutar independientemente de que haya o no una excepcion
            System.out.println("Se terminaron de revisar las excepciones");
        }
    }
}