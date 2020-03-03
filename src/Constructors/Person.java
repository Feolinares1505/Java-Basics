package Constructors;

public class Person {
    //Estos son los atributos de la clase u objeto
    String name;
    int age;

    //Método constructor, "Debe llevar el mismo nombre que la clase"
    public Person(String name, int age){
        //Al definir this. como prefijo, se esta declarando que hace referencia a los atributos de la clase en si, esto con el fin de evitar confucion en java, otra forma seia simplemente cambiar los nombre de los parametros
        //Los métodos contructores sirven para inicializar los atributos de nuestra clase
        this.name = name;
        this.age = age;
    }
    public void ShowDates(){
        System.out.println(name+ " " +age);
    }
}
