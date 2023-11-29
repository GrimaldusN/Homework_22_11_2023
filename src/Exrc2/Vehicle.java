package Exrc2;

public abstract class Vehicle implements TransportControl, Maintenance {
    String model;
    int capacity;
    double fare;

    String route;

    @Override
    public void repair() {
        if (model == "BMV"){
            System.out.println("У вас горит чек это норма");
        }
    }

    @Override
    public void technicalService() {
        if (capacity == 0){
            System.out.println("Отправтесь на заправку и на тех осмотр");
        }
    }

    @Override
    public void forwardMovent() {
        if (capacity != 0){
            //
        }
    }

    @Override
    public void rightTurn() {
//
    }

    @Override
    public void leftTurn() {
//не знаю как мне записать любое движение или поворот без переменых руля и газа к примеру
    }

    @Override
    public void stop() {

    }
}
