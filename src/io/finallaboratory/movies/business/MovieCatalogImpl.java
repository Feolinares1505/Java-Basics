package io.finallaboratory.movies.business;

import io.finallaboratory.movies.data.DataAccessImpl;
import io.finallaboratory.movies.domain.Movie;

public class MovieCatalogImpl implements MovieCatalog {

    private DataAccessImpl result = new DataAccessImpl();

    @Override
    public void startFile(String fileName) {
        result.create(fileName);
    }

    @Override
    public void addMovie(String movie, String fileName) {
        result.write(new Movie(movie), fileName, result.exist(fileName));
    }

    @Override
    public void listMovies(String fileName) {
        result.movieList(fileName);
    }

    @Override
    public void searchMovie(String fileName, String search) {
        result.search(search, fileName);
    }
}
