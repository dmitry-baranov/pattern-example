package com.dmitrii.structured.bridge;

public interface Device {

    boolean isEnable();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int volume);

    int getChannel();

    void setChannel(int channel);
}
