package com.codeclan.example.top10movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 22/05/2017.
 */

public class MovieTest {

    @Test
    public void canGetMovieTitle() {
        Movie movie = new Movie("Good Will Hunting", "Drama", 4.5);
        assertEquals("Good Will Hunting", movie.getTitle());
    }

    @Test
    public void canSetMovieTitle() {
        Movie movie = new Movie("Good Will Hunting", "Drama", 4.5);
        movie.setTitle("A beautiful mind");
        assertEquals("A beautiful mind", movie.getTitle());
    }

    @Test
    public void canGetMovieGenre(){
        Movie movie = new Movie("A beautiful mind", "Drama", 4.0);
        assertEquals("Drama",movie.getGenre());
    }

    @Test
    public void canSetMovieGenre(){
        Movie movie = new Movie("Star Wars","Unknown",3.8);
        movie.setGenre("Sci-fi");
        assertEquals("Sci-fi",movie.getGenre());
    }
}
