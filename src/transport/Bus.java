package transport;

import Driver.Driver;
import Driver.DriverD;
import transportException.DiagnosticFailedException;

public class Bus extends Transport<DriverD> {
    private Capacity capacity;


    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public void maxSpeed() {
        int maxSpeed = (int) (Math.random() * 201);
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " " + "составила " + maxSpeed + " км/ч;");
    }

    @Override
    public void passDiagnostics() throws DiagnosticFailedException{
        throw new DiagnosticFailedException("Данное транспортное средство в диагностике не нуждается!", this);
    }

    public void printType() {
        if (capacity != null) {
            System.out.println(capacity);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    /*@Override
    public void printInfo(Driver driverD) {
        System.out.println("Водитель " + driverD.getFullName() + " управляет автобусом "
                + getBrand() + " " + getModel() +
                " и будет участвовать в заезде");
    }*/

    @Override
    public void pitStop(Transport transport) {
        System.out.println(transport.getBrand() + " " + transport.getModel() + " зашел на пит-стоп;");
    }

    @Override
    public void bestLapTime() {
        double maxLapTime = (Math.random() * 3 + 3);
        System.out.printf("Лучшее время круга у " + getBrand() + " " + getModel() + " " + "составило %.2f;", maxLapTime);
        System.out.println();
    }

    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начал движение");
    }

    public void stopMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " закончил движение");
    }

      public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}

