package com.dmitrii.structured.facade;

public class HomeTheatreFacade {

    private final Lights lights;
    private final Projector projector;
    private final SoundSystem soundSystem;

    public HomeTheatreFacade(Lights lights, Projector projector, SoundSystem soundSystem) {
        this.lights = lights;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public String playMovie(){
        String result = lights.enable();
        result = result + " " + projector.enable();
        result = result + " " + soundSystem.enable();
        result = result + " everything ready, movie start";
        return result;
    }
}
