package com.dmitrii.structured.bridge;

public class Remote {

    protected final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower(){
        if(device.isEnable()){
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeUp(){
        int volume = device.getVolume() + 1;
        if(volume <= 100){
            device.setVolume(volume);
        }
    }

    public void volumeDown(){
        int volume = device.getVolume() - 1;
        if(volume >= 0){
            device.setVolume(volume);
        }
    }

    public void channelUp(){
        device.setChannel(device.getChannel() + 1);
    }

    public void channelDown(){
        device.setChannel(device.getChannel() - 1);
    }

}
