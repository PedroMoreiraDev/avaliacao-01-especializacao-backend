package Service;

import Entity.Movies;

import java.util.List;

public interface IMovies {

    void save(Movies movies);
    List<Movies> findByGenre(String genre);
}
