package ru.netology.movieposter;

public class MovieRepository {

    private Movie[] movies = new Movie[0];
    private Movie[] forRemove = new Movie[0];

    public void save(Movie film) {
        Movie[] tmp = new Movie[movies.length +1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = film;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public void removeByID(int id) {
        Movie[] tmp = new Movie[movies.length - 1];
        int copyToIndex = 0;
        for (Movie film : movies) {
            if (film.getId() != id) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
            movies = tmp;
        }

    }
    public void findID(int id) {
        Movie[] tmp = new Movie[movies.length - (movies.length - 1)];
        int copyToIndex = 0;
        for (Movie film : movies) {
            if (film.getId() == id) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
            movies = tmp;
        }

    }
    public Movie[] removeAll() {
        movies = forRemove;
        return movies;
    }

}
