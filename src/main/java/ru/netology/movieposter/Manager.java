package ru.netology.movieposter;

public class Manager {

    private MovieRepository cinema;
    private int limit;

    public Manager(MovieRepository cinema, int limit) {
        this.cinema = cinema;
        this.limit = limit;
    }
    public Manager() {
        limit = 10;
    }

    public void save(Movie film) {
        cinema.save(film);
    }

    public Movie[] findAll() {
        Movie[] all = cinema.findAll();
        return all;
    }

    public Movie[] findLast() {
        Movie[] all = cinema.findAll();
        int resultLength;
        if (limit < all.length) {
            resultLength = limit;
        } else {
            resultLength = all.length;
        }
        Movie[] reservedResult = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reservedResult[i] = all[all.length - 1 - i];
        }
        return reservedResult;
    }

    public Movie[] removeAll() {
        Movie[] all = cinema.removeAll();
        return all;
    }
}
