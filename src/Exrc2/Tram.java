package Exrc2;

public class Tram extends Vehicle implements TransportControl, Maintenance{
    int trackWidth;
    boolean electric;

    @Override
    public void repair() {
        super.repair();
    }

    @Override
    public void technicalService() {
        super.technicalService();
    }

    @Override
    public void forwardMovent() {
        super.forwardMovent();
    }

    @Override
    public void rightTurn() {
        super.rightTurn();
    }

    @Override
    public void leftTurn() {
        super.leftTurn();
    }

    @Override
    public void stop() {
        super.stop();
    }
}
