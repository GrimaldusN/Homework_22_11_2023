package Exrc3;

import java.time.LocalDateTime;

public class SmartHome implements ControInterface {
    String homeName;
    Device[] devices;
    boolean isAwayMode;
    LocalDateTime lastUpdate = LocalDateTime.now();

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOf() {

    }

    @Override
    public void getStatus() {

    }
}
