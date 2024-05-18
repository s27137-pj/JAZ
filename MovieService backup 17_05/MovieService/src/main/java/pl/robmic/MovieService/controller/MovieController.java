package pl.robmic.MovieService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.robmic.MovieService.model.Movie;
import pl.robmic.MovieService.service.MovieService;

import java.util.List;

@RestController
public class MovieController {


    public final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


//    zadanie 2
    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return ResponseEntity.ok(movieService.findAll());
    }


//    zadanie 3

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id){
        return ResponseEntity.ok(movieService.getMovieById(id));
    }

//    zadanie 4

    @PostMapping("/movies")
    public ResponseEntity<Movie> addNewMovie(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.addNewMovie(movie));
    }

//    zadanie 5

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable int id, @RequestBody Movie movie){
        return ResponseEntity.ok(movieService.updateMovie(id, movie));
    }

//    zadanie 6

    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Void> deleteMovieById(@PathVariable int id){
        movieService.deleteMovieById(id);
        return ResponseEntity.status(204).build();
    }







}
