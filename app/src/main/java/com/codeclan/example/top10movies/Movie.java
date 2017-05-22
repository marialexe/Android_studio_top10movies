package com.codeclan.example.top10movies;

/**
 * Created by user on 22/05/2017.
 */

public class Movie {
    private String title;
    private String genre;
    private double current_ranking;

    public Movie (String title, String genre, double current_ranking){
        this.title = title;
        this.genre = genre;
        this.current_ranking = current_ranking;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newtitle) {
        this.title = newtitle;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String newgenre) {
        this.genre = newgenre;
    }
}
