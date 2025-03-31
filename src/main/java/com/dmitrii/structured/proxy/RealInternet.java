package com.dmitrii.structured.proxy;

import java.util.Set;

public class RealInternet implements Internet{

    @Override
    public boolean connectTo(String website){
        return true;
    }

}
