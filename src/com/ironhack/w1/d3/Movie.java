package com.ironhack.w1.d3;

public class Movie {
//  PROPERTIES
    protected String title;
    private int duration;
    public final boolean IS_GOOD = true;

//  CONSTRUCTOR
    public Movie(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    public Movie(String title) {
        this.title = title;
        this.duration = 90;
    }

    //  GETTERS

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

//  SETTERS

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

//  METHOD
    public void play(){
        System.out.println("Playing " + this.title);
    }

//  STATIC METHOD
    public static void getAlert(){
        System.out.println("It's illegal to pirate this movie.");
    }


//  OVERRIDE
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
