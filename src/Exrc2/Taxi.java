package Exrc2;

public class Taxi extends Vehicle implements Maintenance, TransportControl{
    String licensePlate;
    boolean available;

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
