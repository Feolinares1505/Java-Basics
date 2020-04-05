package io.projects.movies.business;

/**Contiene las operaciones necesarias de la aplicación Catalogo de Peliculas*/
public interface MovieCatalog {
    void startFile(String fileName);
    void addMovie(String movieName, String fileName);
    void listMovies(String fileName);
    void searchMovie(String fileName, String search);
}
