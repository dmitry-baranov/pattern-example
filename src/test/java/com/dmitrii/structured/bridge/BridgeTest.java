package com.dmitrii.structured.bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BridgeTest {

    @Test
    public void bridgeTest(){
        System.out.println("Tests with basic remote.");
        TV tv = new TV();
        Remote basicRemote = new Remote(tv);
        basicRemote.togglePower();
        assertTrue(tv.isEnable());

        System.out.println("Tests with advanced remote.");
        Radio radio = new Radio();
        AdvanceRemote advancedRemote = new AdvanceRemote(radio);
        advancedRemote.togglePower();
        advancedRemote.volumeUp();
        Assertions.assertEquals(1, radio.getVolume());
        advancedRemote.mute();
        Assertions.assertEquals(0, radio.getVolume());
    }

}