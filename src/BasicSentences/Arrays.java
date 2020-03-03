package BasicSentences;

public class Arrays {

    /*Matrices (Arrays, Arreglos) Que es? Estructura de datos que contiene una coleccion de valores del mismo tipo
    Para Que? Sirve para almacenar valores que normalmente tienen alguna relacion entre si*/

    public static void main(String[] args) {
        //declaracion e iniciar la matriz
        int [] mi_matriz = {5,38,-15,92,71,95,85,65,25,14,78};

        //La propiedad lenght del array devuelve la longitud de la matriz !Hasta el final del array ¡
        for(int i=0;i<mi_matriz.length;i++){
            System.out.println("Valor del indice "+i+ "=" +mi_matriz[i]);
        }
    }
}
