package ru.netology.movieposter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    String movie1 = "movie1";
    String movie2 = "movie2";
    String movie3 = "movie3";
    String movie4 = "movie4";
    String movie5 = "movie5";
    String movie6 = "movie6";
    String movie7 = "movie7";
    String movie8 = "movie8";
    String movie9 = "movie9";
    String movie10 = "movie10";

    @Test
    public void shouldBeAddNewMovie() {

        Manager manager = new Manager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
        };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(actual, expected);

    }
    @Test
    public void shouldBeReverseOrder() {

        Manager manager = new Manager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        String[] expected = {
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);

    }
    @Test
    public void shouldBeReverseOrderLastSeven7() {

        Manager manager = new Manager(7);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        String[] expected = {
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);

    }
}
