package com.dmitrii.structured.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProxyTest {

    @Test
    public void proxyTest() {
        Internet realInternet = new RealInternet();


        Internet proxyInternet = new ProxyInternet(realInternet);

        assertFalse(proxyInternet.connectTo("youtube.com"));
        assertTrue(realInternet.connectTo("youtube.com"));
    }
}