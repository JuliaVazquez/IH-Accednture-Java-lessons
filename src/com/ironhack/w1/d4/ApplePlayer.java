package com.ironhack.w1.d4;

public class ApplePlayer extends Player implements IPlayable{
//  CONSTRUCTORS

    public ApplePlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

//  ABSTRACT METHODS

    @Override
    public void close() {

        System.out.println("Closing Apple Playes");
    }

    @Override
    public void play() {
        System.out.println("Playing Apple Player track " + getCurrentTrack());
    }

    @Override
    public void pause() {
        System.out.println("Pausing Apple Player track ");
    }

    @Override
    public void mute() {
        setVolume(0);
    }

    @Override
    public void increaseVolume() {
        setVolume(getVolume()+0.1);
        if (getVolume() > MAX_VOLUME) setVolume(MAX_VOLUME);
    }
}
