package io.projects.movies;

import io.projects.movies.business.MovieCatalogImpl;
import io.projects.movies.domain.Movie;

import java.util.Scanner;

/**Contiene el menu que permite al usuario seleccionar la opción a ejecutar via consola*/
public class Main {
    public static void main(String[] args) {

        int value; //Guarda la opción que seleccione el usuario
        String fileName; //Ruta donde se almacenará el archivo
        String movieName;

        MovieCatalogImpl options = new MovieCatalogImpl();
        Scanner option = new Scanner(System.in);
        Scanner valueMovie = new Scanner(System.in);
        Scanner valueFile = new Scanner(System.in);

        System.out.println("Elige una opcion:\n" +
                "   1 - Iniciar catalogo de peliculas\n" +
                "   2 - Agregar pelicula\n" +
                "   3 - Listar Peliculas\n" +
                "   4 - Buscar Pelicula\n" +
                "   0 - Salir");

        value = option.nextInt();

        switch (value){
            case 1:
                System.out.println("Ingresa la ruta del archivo a crear.");
                fileName = valueFile.nextLine();

                options.startFile(fileName);
                break;
            case 2:
                System.out.println("Ingresa el nombre de la nueva pelicula:");
                movieName = valueMovie.nextLine();
                Movie movie = new Movie(movieName);
                System.out.println("Ingresa la ruta del archivo en el que deseas agregar la nueva pelicula:");
                fileName = valueFile.nextLine();
                options.addMovie(movie.getName(), fileName);
                break;
            case 3:
                System.out.println("Ingresa la ruta del archivo del que deseas extraer la lista:");
                fileName = valueFile.nextLine();
                options.listMovies(fileName);
                break;
            case 4:
                System.out.println("Ruta del archivo:");
                fileName = valueFile.nextLine();
                System.out.println("Nombre de la pelicula que desea buscar:");
                movieName = valueMovie.nextLine();
                options.searchMovie(fileName, movieName);
                break;
            case 0:
                System.out.println("Hasta la proxima :'|");
                break;
            default:
                System.out.println("Digitaste una opción incorrecta.");
                break;
        }
    }
}