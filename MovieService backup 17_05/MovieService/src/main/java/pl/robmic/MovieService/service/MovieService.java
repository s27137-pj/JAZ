package pl.robmic.MovieService.service;

import org.springframework.stereotype.Service;
import pl.robmic.MovieService.model.Movie;
import pl.robmic.MovieService.advice.MyBadRequestException;
import pl.robmic.MovieService.advice.MyNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private List<Movie> movies;

    public MovieService(){
        movies = new ArrayList<>();
        movies.add(new Movie(1L, "Potop", "History"));
        movies.add(new Movie(2L, "Hangover", "Comedy"));
        movies.add(new Movie(3L, "Top Gun", "Action"));
    }

//    do zadania 2
    public List<Movie> findAll(){
        return movies;
    }

//    do zadania 3

    public Movie getMovieById(int id){
        if(id > movies.size()){
            throw new MyNotFoundException();
        } else {
            return movies.get(id -1);
        }
    }

// do zadania 4

    public Movie addNewMovie(Movie movie){
        if(movie.getName() == null || movie.getCategory() == null){
            throw new MyBadRequestException();
        } else {
            movies.add(movie);
            return movie;
        }
    }

//    zadanie 5 wersja 1

    public Movie updateMovie(int id, Movie movie){
        if(id > movies.size() || movie.getName() == null || movie.getCategory() == null){
            throw new MyBadRequestException();
        } else {
            movies.remove(id -1);
            movies.add(id -1, movie);
            return movie;
        }
    }

//    zadanie 5 wersja 2

    public Movie updateMovie2(int id, Movie movie){
        if(id > movies.size() || movie.getName() == null || movie.getCategory() == null){
            throw new MyBadRequestException();
        } else {
            movies.add(movie);
            return movie;
        }
    }

//    zadanie 6
    public void deleteMovieById(int id){
        if(id > movies.size()){
            throw new MyBadRequestException();
        } else {
            movies.remove(id - 1);
        }
    }


}
