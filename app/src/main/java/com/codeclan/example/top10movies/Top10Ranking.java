package com.codeclan.example.top10movies;

import java.util.ArrayList;

/**
 * Created by user on 23/05/2017.
 */

public class Top10Ranking {
    private ArrayList<Movie> movies;

    public Top10Ranking(ArrayList<Movie> movies){
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public int getSize(){
        return movies.size();
    }

    public int getMovieRank(String movie){
        int index = movies.indexOf(movie);
        int rank = index + 1;
        return rank;
    }
}
