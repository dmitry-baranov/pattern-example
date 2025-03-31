package com.dmitrii.structured.bridge;

public class Radio implements Device{

    private boolean status;
    private int volume;
    private int channel;
    @Override
    public boolean isEnable() {
        return status;
    }

    @Override
    public void enable() {
        this.status = true;
    }

    @Override
    public void disable() {
        this.status = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
