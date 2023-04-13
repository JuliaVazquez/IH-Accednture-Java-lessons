package com.ironhack.w1.d4;

public abstract class Player {
    private double volume;
    private int currentTrack;

//  CONSTRUCTORS

    public Player(double volume, int currentTrack) {
        this.volume = volume;
        this.currentTrack = currentTrack;
    }

//   GETTERS

    public double getVolume() {
        return volume;
    }

    public int getCurrentTrack() {
        return currentTrack;
    }

//  SETTERS

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setCurrentTrack(int currentTrack) {
        this.currentTrack = currentTrack;
    }

//  METHODS
    public void getNextTrack(){
        this.currentTrack++;
    }

    public abstract void close();
}
