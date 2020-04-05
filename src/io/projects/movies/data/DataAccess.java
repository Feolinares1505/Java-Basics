package io.projects.movies.data;

import io.projects.movies.domain.Movie;

import java.util.List;


/**Contiene las operaciones a ejecutar en el archivo peliculas.txt*/
public interface DataAccess {

    boolean exist(String fileName);

    List<Movie> movieList(String name);

    void write(Movie movie, String fileName, boolean created);

    void create(String fileName);

    String search(String movieName, String fileName);

    void delete(String fileName);
    
}
