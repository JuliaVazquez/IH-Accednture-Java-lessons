package com.ironhack.w1.d3;

public class HorrorMovie extends Movie{

// PROPERTIES
    private boolean isReallyScary;

//  CONSTRUCTOR super de la clase padre
    public HorrorMovie(String title, int duration, boolean isReallyScary) {
        super(title, duration);
        this.isReallyScary = isReallyScary;
    }

//  GETTERS
    public boolean isReallyScary() {
        return isReallyScary;
    }

//  SETTERS
    public void setReallyScary(boolean reallyScary) {
        isReallyScary = reallyScary;
    }

    @Override
    public void setTitle(String title){
        super.setTitle(title + " scary");
    }

//  OVERRIDE

    @Override
    public String toString() {
        return "HorrorMovie{" +
                super.getTitle() + " " +
                super.getDuration() + " " +
                "isReallyScary=" + isReallyScary +
                '}';
    }

    @Override
    public void play(){
        System.out.println("Playing a scary movie.");
    }
}
