package com.codeclan.example.top10movies;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 23/05/2017.
 */

public class Top10RankingTest {
    Movie movie;
    Top10Ranking movies;

    @Test
    public void canAddMovie(){
        movie = new Movie("Good Will Hunting","Drama",1);
        movies = new Top10Ranking();
        movies.addMovie(movie);
        assertEquals(1,movies.getSize());
    }

    @Test
    public void canGetMovieRank(){
        ArrayList<Movie> movies = new ArrayList<>();
        movie = new Movie ("Good Will Hunting","Drama",1);
        movies.add(movie);
        assetEquals(1, movies.getMovieRank());
    }



}
