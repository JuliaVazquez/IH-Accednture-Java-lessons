package com.ironhack.w1.d4;

public interface IPlayable {
//  PROPERTIES OR ATTRIBUTES
    double MAX_VOLUME = 1;

    public abstract void play();
    void pause();
    void mute();
    void increaseVolume();

}
