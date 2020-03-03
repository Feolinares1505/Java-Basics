package BasicSentences;

//String no es un tipo primitivo (no especifica aun que diferencia hay de un PRIMITIVO A UNA CLASE)
//(Almacenar una cadena de caracteres) String nombrar_la_variable = asignar_valor_a_la_variable;
public class StringClass {
    public static  void main(String args[]) {
        //string tiene una serie de metodos para la manipulacion de cadena de caracteres:
        // metodos mas usados ejemplos con el nombre FREDY

        //length(): devuelve la longitud de una cadena de caracteres EJP[ mi_nombre.lenght()=5].
        String lenght = "prueba";
        String lenght2 = "Prueba";
        System.out.println(lenght.length());
        //charAt(n): devuelve la posicion de un caracter dentro de una cadena(Las posiciones empiezan a contar desde 0)EJP[ mi_nombre.charAt(3)= d].
        System.out.println(lenght.charAt(4));
        //substring(x,y): devuelve una subcadena dentro de la cadena, siendo Xel caracter a partir del cual se extrae Y el # de caracteres que quieren extraer.
        System.out.println(lenght.substring(1, 4));
        //equals(cadena): devuelve true si dos cadenas que se comparan son iguales y false si no lo son. Distingue mayusculas y minusculas
        System.out.println(lenght.equals(lenght2));
        //equalsIgnoreCase(cadena): igual que el anterior pero sin tener en cuenta mayusculas y minusculas.
        System.out.println(lenght.equalsIgnoreCase(lenght2));
        //todos los datos tipo string van en comillas dobles ""
        String nombre = "fredy";

        System.out.println("Mi nombre es "+ nombre);




    }
}
