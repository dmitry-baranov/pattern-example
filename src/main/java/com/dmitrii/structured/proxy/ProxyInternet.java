package com.dmitrii.structured.proxy;

import java.util.List;
import java.util.Set;

public class ProxyInternet implements Internet{
    private final Internet internet;

    private static final Set<String> blockedWebsites =
            Set.of("facebook.com", "youtube.com", "tiktok.com");

    public ProxyInternet(Internet internet){
        this.internet = internet;
    }

    @Override
    public boolean connectTo(String website) {
        if(blockedWebsites.contains(website)){
            return false;
        } else {
            return internet.connectTo(website);
        }
    }
}
