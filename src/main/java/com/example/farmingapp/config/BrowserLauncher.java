package com.example.farmingapp.config;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.awt.Desktop;
import java.net.URI;

public class BrowserLauncher {

    @EventListener(ApplicationReadyEvent.class)
    public void launchBrowser() {
        try {
            Desktop.getDesktop().browse(new URI("http://localhost:5030/"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
