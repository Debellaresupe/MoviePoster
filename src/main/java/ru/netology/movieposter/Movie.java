package ru.netology.movieposter;

public class Movie {
    private int id;
    private int movieId;
    private String movieName;
    private int moviePrice;
    private int count;

    public Movie(int id, int movieId, String movieName, int moviePrice, int count) {
        this.id = id;
        this.movieId = movieId;
        this.movieName = movieName;
        this.moviePrice = moviePrice;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(int moviePrice) {
        this.moviePrice = moviePrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
