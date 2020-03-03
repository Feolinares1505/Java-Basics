package BasicSentences;

public class MathClass {
    public static void main(String args[]){
        //Las Clases en java de dividen en dos tipos: las Propias y las Predefinidas
        //Las propias son aquellas que creamos y programamos adaptandolas a nuestras necesidades
        //Las Predefinidas son aquellas que ya fueron creadas para suplir ciertas necesidades y a las cuales podemos hacer uso

        System.out.println(Math.sqrt(10)); //Calcula la raiz cuadrada de un numero

        System.out.println(Math.pow(10, 3)); //Potencia un numero, definiendo el primer valor como la base y el segundo como el exponente

        System.out.println(Math.round(12.5)); //Redondea el numero en su interior

        System.out.println(Math.PI); //Imprime el valor de pi

        System.out.println(Math.E); //Imprime el valor de E

        System.out.println(Math.random() * 9 + 1); //Crea un numero aleatorio tomando en cuenta el rango seleccionado

        System.out.println(Math.max(10, 45)); //Devuelve el valor de dos numeros

        System.out.println(Math.min(58, 2)); //Devuelve el menor de dos numeros

    }
}

