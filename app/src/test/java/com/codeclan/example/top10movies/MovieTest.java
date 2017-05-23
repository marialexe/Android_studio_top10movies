package com.codeclan.example.top10movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 22/05/2017.
 */

public class MovieTest {

    @Test
    public void canGetMovieTitle() {
        Movie movie = new Movie("Good Will Hunting", "Drama", 1);
        assertEquals("Good Will Hunting", movie.getTitle());
    }

    @Test
    public void canSetMovieTitle() {
        Movie movie = new Movie("Good Will Hunting", "Drama", 1);
        movie.setTitle("A beautiful mind");
        assertEquals("A beautiful mind", movie.getTitle());
    }

    @Test
    public void canGetMovieGenre(){
        Movie movie = new Movie("A beautiful mind", "Drama", 2);
        assertEquals("Drama",movie.getGenre());
    }

    @Test
    public void canSetMovieGenre(){
        Movie movie = new Movie("Star Wars","Unknown",8);
        movie.setGenre("Sci-fi");
        assertEquals("Sci-fi",movie.getGenre());
    }

    @Test
    public void canGetMovieRanking(){
        Movie movie = new Movie("The Martian", "Sci-fi",7);
        assertEquals(7,movie.getRanking());
    }

    @Test
    public void canSetMovieRanking(){
        Movie movie = new Movie("The Martian", "Sci-fi",7);
        movie.setRanking(5);
        assertEquals(5,movie.getRanking());
    }

    @Test
    public void canOverrideToString(){
        Movie movie = new Movie("Lord of the Rings","Adventure", 6);
        assertEquals("Title: 'Lord of the Rings', Genre: 'Adventure', Ranking: 6",movie.toString());
    }
}
