package com.javabasics.inputandoutput.files;

import java.io.*;
import static com.javabasics.inputandoutput.files.FilesOptions.*;

public class FIlesUse {
    public static void main(String[] args) throws IOException {

        final String PATH_FILE = "C:\\testJavaFiles\\testFile.txt";

        createFile(PATH_FILE);
        writeFile(PATH_FILE, "Añade esto pues");
        appendToFile(PATH_FILE, "Este es el texto anexado");
        readFile(PATH_FILE);

        /*--------------------------------------------------------------------------------------------------------*/

        //LLenar la información de un archivo:
        /*File archivo = new File("C:\\testJavaFiles\\testFile.txt"); //Esto solo define la ruta en la que se encontrará el archivo

        try{
            //La clase PrintWriter es la que crea el archivo en fisico con la ruta definida en el constructor de la clase File y
            //se usa para imprimir lineas completas mediante los metodos
            //(print() y println())
            //La desventaja es que estos metodos es que se pierde la información almacenada de forma previa

            //Mientras que la clase FileWriter se utiliza para escribir información a un archivo y solo permite imprimir por caracteres
            //Para que la información ya existente no se pierda, podemos usar el parametro append: true, y así la información se agregará sin eliminar la ya definida, de lo contrario este se pasara cn su valor por defecto false, borrando todo antes de...
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.println("\nHola, está es la primera linea que insertaré al archivo");

            if (archivo.exists()){
                System.out.println("El archivo se ha creado con exito");
            }
            salida.close(); //Cerramos el archivo
        }catch (IOException e){
            e.printStackTrace();
        }*/

        //Leer la información de un archivo:
        /*try{
            //La clase FileReader, lee los caracteres y la clase BufferedReader, lee la linea completa
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();
            while (lectura != null){
                System.out.println("La info dentro del archivo es: " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close(); //Cerramos el archivo
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
