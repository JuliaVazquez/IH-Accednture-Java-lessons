package com.ironhack.w1.d4;

public class WebPlayer extends Player{


//  CONSTRUCTORS

    public WebPlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

// ABSTRACT METHODS
    @Override
    public void close() {
        System.out.println("Closing Web Player");
    }
}
