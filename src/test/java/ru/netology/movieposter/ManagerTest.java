package ru.netology.movieposter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    MovieRepository repo = new MovieRepository();
    Manager manager = new Manager(repo);
    Movie film1 = new Movie(1, 11, "Film1", 100, 1);
    Movie film2 = new Movie(2, 22, "Film2", 200, 2);
    Movie film3 = new Movie(3, 33, "Film3", 300, 3);
    Movie film4 = new Movie(4, 44, "Film4", 400, 4);
    Movie film5 = new Movie(5, 55, "Film5", 500, 5);
    Movie film6 = new Movie(6, 66, "Film6", 600, 6);

    @Test
    public void shouldBeAddNewMovie() {

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

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


        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);


        Movie[] expected = {
                film5,
                film4,
                film3,
                film2,
                film1,
        };
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);

    }
    @Test
    public void shouldBeRemoveAll() {

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        repo.removeAll();

        Movie[] expected = {};

        Movie[] actual = manager.findAll();

        Assertions.assertArrayEquals(actual, expected);
    }

}
