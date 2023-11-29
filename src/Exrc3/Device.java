package Exrc3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Device implements ControInterface, Security {
    String deviceId;
    String location;
    boolean isOn;
    LocalDateTime lastChecked;
}
