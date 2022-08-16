package ru.netology.movieposter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieRepositoryTest {
    Movie film1 = new Movie(1, 11, "Film1", 100, 1);
    Movie film2 = new Movie(2, 22, "Film2", 200, 2);
    Movie film3 = new Movie(3, 33, "Film3", 300, 3);
    Movie film4 = new Movie(4, 44, "Film4", 400, 4);
    Movie film5 = new Movie(5, 55, "Film5", 500, 5);
    Movie film6 = new Movie(6, 66, "Film6", 600, 6);

    @Test
    public void shouldBeSaveFilms() {
        MovieRepository repo = new MovieRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);

        Movie[] expected = {film1, film2, film3, film4, film5};
        Movie[] actual = repo.findAll();

        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldBeRemovedFilm2() {
        MovieRepository repo = new MovieRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.removeByID(film2.getId());

        Movie[] expected = {film1, film3, film4, film5};
        Movie[] actual = repo.findAll();

        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldBeFindFilm2() {
        MovieRepository repo = new MovieRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.findID(film2.getId());

        Movie[] expected = {film2};
        Movie[] actual = repo.findAll();

        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldBeNotFind() {
        MovieRepository repo = new MovieRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.findID(film6.getId());
        Movie[] expected = {null};
        Movie[] actual = repo.findAll();

        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldBeRemoveAll() {
        MovieRepository repo = new MovieRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.removeAll();
        Movie[] expected = {};
        Movie[] actual = repo.findAll();

        Assertions.assertArrayEquals(actual, expected);
    }

}

