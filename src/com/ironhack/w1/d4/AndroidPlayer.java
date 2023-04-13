package com.ironhack.w1.d4;

public class AndroidPlayer extends Player implements IPlayable, IShareable{

//  CONTRUCTORS

    public AndroidPlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

//  ABSTRACT METHODS

    @Override
    public void close() {
        System.out.println("Closing Android Player");
    }

    @Override
    public void play() {
        System.out.println("Playing Android Player track " + getCurrentTrack());
    }

    @Override
    public void pause() {
        System.out.println("Pausing Android Player");
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

    @Override
    public String share() {
        return "You are sharing.";
    }
}
