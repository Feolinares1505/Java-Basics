package com.jdbc;
import java.sql.*; //Este es el paquete que contiene las clases necesarias para hacer la conexion con la base de datos

public class App {
    public static void main(String[] args){
        //El parametro useSSL
        String url = "jdbc:mysql://localhost:3306/products?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        //Cargamos el Driver de mysql
        try{
            //Cargamos el Driver con la siguiente linea
            //ESto nos cargará en memoria la clase
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Creamos el objeto de conexion
            Connection connection = (Connection) DriverManager.getConnection(url, "root", "");

            //Creamos el objeto de tipo Statement que nos permitirá ejecutar nuestras sentencias SQL
            //El metodo createStatemente del objeto connection nos va a regresar un objeto de tipo Statement que guardaremos en la variable statement
            Statement statement = connection.createStatement();

            //Definimos el query que deseamos aplicar en la base de datos
            String sql = "select id_product, name from product";
            //Ejecutamos el query mediante la siguiente linea
            //Esta variable nos va a contener todos los datos traidos desde la base de datos
            ResultSet result = statement.executeQuery(sql);

            //Recorremos la variable result
            while (result.next()){
                System.out.print("ID: " + result.getInt(1) + " ");
                System.out.print("Name: " + result.getString(2) + "\n");
            }
            //Por ultimo debemos cerrar cada uno de los objetos que hemos utilizado
            connection.close();
            statement.close();
            result.close();
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
