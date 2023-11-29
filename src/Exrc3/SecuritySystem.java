package Exrc3;

public class SecuritySystem extends Device{
    boolean isArmed;
    String[] acceessCodes;

    @Override
    public void turnOn() {
        armSystem("1");
    }

    @Override
    public void turnOf() {
        disarmSystem("0");
    }

    @Override
    public void getStatus() {

    }

    @Override
    public void armSystem(String code) {
        code= String.valueOf(1);
    }

    @Override
    public void disarmSystem(String code) {
        code= String.valueOf(0);
    }
}
