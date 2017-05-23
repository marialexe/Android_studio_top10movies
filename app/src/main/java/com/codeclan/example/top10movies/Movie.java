package com.codeclan.example.top10movies;

/**
 * Created by user on 22/05/2017.
 */

public class Movie {
    private String title;
    private String genre;
    private int current_ranking;

    public Movie (String title, String genre, int current_ranking){
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

    public double getRanking() {
        return this.current_ranking;
    }

    public void setRanking(int newranking) {
        this.current_ranking = newranking;
    }

    @Override
    public String toString(){
        return String.format("Title: '%s', Genre: '%s', Ranking: %d", title, genre, current_ranking);
    }
}
