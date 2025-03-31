package com.dmitrii.structured.facade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FacadeTest {

    @Test
    public void facadeTest(){
        Lights lights = new Lights();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(lights, projector, soundSystem);

        Assertions.assertEquals("Lights on Projector " +
                "on SoundSystem on everything ready, " +
                "movie start", homeTheatreFacade.playMovie());
    }

}