package ru.netology.movieposter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ManagerTest {
    MovieRepository repo = new MovieRepository();
    Manager manager = new Manager(repo, 10);

    Movie film1 = new Movie(1, 11, "Film1", 100, 1);
    Movie film2 = new Movie(2, 22, "Film2", 200, 2);
    Movie film3 = new Movie(3, 33, "Film3", 300, 3);
    Movie film4 = new Movie(4, 44, "Film4", 400, 4);
    Movie film5 = new Movie(5, 55, "Film5", 500, 5);
    Movie film6 = new Movie(6, 66, "Film6", 600, 6);

    @BeforeEach
    public void setup() {
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
    }

    @Test
    public void shouldBeAddNewMovie() {

        Movie[] expected = {
                film1,
                film2,
                film3,
                film4,
                film5,
        };
        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldBeReverseOrder() {

        Movie[] expected = {
                film5,
                film4,
                film3,
                film2,
                film1};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldBeRemoveAll() {

        repo.removeAll();

        Movie[] expected = {};

        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(actual, expected);
    }

}
