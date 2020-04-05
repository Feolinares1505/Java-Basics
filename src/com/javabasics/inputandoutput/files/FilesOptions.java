package com.javabasics.inputandoutput.files;

import java.io.*;

//PENDEJO "HAY QUE USAR EL METODO CLOSE CADA VEZ QUE SE HAGA UNA VARIACIÓN EN EL ARCHIVO, DE LO CONTRARIO NO GUARDARÁ LOS CAMBIOS"
public class FilesOptions {

    public static void createFile(String path){
        File file = new File(path);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(file));
            salida.close(); //El momento en que cerramos este flujo es cuando se escribe el archivo en nuestro disco duro, de lo contrario esto no sucederá
            System.out.println("El archivo se ha creado con exito");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**writeFile es un metodo utilizado para llenar un archivo vacio o sobreescribirlo, pues no guaradará los valores anteriores*/
    public static void writeFile(String path, String textToAdd){
        File file = new File(path);
        try {
            PrintWriter write = new PrintWriter(new FileWriter(file));
            write.println(textToAdd);
            write.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**En este metodo mostraremos la información existente dentro del archivo*/
    public static void readFile(String path){
        File file = new File(path);

        try{
            BufferedReader read = new BufferedReader(new FileReader(file));
            String valuesIntoFile;
            valuesIntoFile = read.readLine();
            while (valuesIntoFile != null){
                System.out.println("Info del archivo: " + valuesIntoFile);
                valuesIntoFile = read.readLine();
            }
            read.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**En este metodo vamos a escribir un archivo, "pero" manteniendo los valores que haya con anterioridad*/
    public static void appendToFile(String path, String textToAdd){
        File file = new File(path);
        try {
            PrintWriter write = new PrintWriter(new FileWriter(file, true));
            write.println(textToAdd);
            write.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
