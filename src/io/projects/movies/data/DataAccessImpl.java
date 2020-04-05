package io.projects.movies.data;

import io.projects.movies.domain.Movie;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataAccessImpl implements DataAccess {

    @Override
    public boolean exist(String fileName) {
        File file = new File(fileName);
        return file.exists();
    }

    @Override
    public List<Movie> movieList(String fileName) {
        List<Movie> movieList = new ArrayList<>();

        File file = new File(fileName);
        int count = 0;
        try{
            BufferedReader movies = new BufferedReader(new FileReader(file));
            String value = movies.readLine();
            movieList.add(new Movie(value));
            while (movies.readLine() != null){
                if (movies.readLine() == null){
                    System.out.println("Hasta aqui llegamos");
                }else {
                    value = movies.readLine();
                    movieList.add(new Movie(value));
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        for (Movie movie:movieList
             ) {
            System.out.println("Pelicula: " + count + " - " + movie.getName());
            ++count;
        }
        return movieList;
    }

    @Override
    public void write(Movie movie, String fileName, boolean created) {
        if (created){
            try {
                PrintWriter addMovie = new PrintWriter(new FileWriter(fileName, true));
                addMovie.print(movie.getName().toLowerCase() + "\n");
                addMovie.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }else {
            System.out.println("No existe el archivo en el cual desea agregar la pelicula");
        }

    }

    @Override
    public void create(String fileName) {
        File file = new File(fileName);
        if (file.exists()){
            System.out.println("Ya existe el archivo.");
        }else {
            try {
                PrintWriter result = new PrintWriter(new FileWriter(file));
                result.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String search(String movieName, String fileName) {
        String searched = null;
        for (Movie movie: movieList(fileName)
             ) {
            if (movie.getName().equals(movieName.toLowerCase())) {
                searched = movie.getName();
                break;
            }else {
                System.out.println("No encontramos tu pelicula!");
            }
        }
        return searched;
    }

    @Override
    public void delete(String fileName) {

    }
}
