package transport;

import Driver.Driver;
import Driver.DriverB;

public class Car extends Transport<DriverB> {

    private BodyType bodyType;

    public Car(String brand,
               String model,
               double engineVolume,
               BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public void maxSpeed() {
        int maxSpeed = (int) (Math.random() * 301);
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " " + "составила " + maxSpeed + " км/ч;");
    }

    public void printType() {
        if (bodyType != null) {
            System.out.println(bodyType);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public void pitStop(Transport transport) {
        System.out.println(transport.getBrand() + " " + transport.getModel() + " зашел на пит-стоп;");
    }

    @Override
    public void bestLapTime() {
        double maxLapTime = (Math.random() * 2 + 2);
        System.out.printf("Лучшее время круга у " + getBrand() + " " + getModel() + " " + "составило %.2f;", maxLapTime);
        System.out.println();
    }

    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    public void stopMoving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void printInfo(Transport transport, Driver driverB) {
        System.out.println("Водитель " + driverB.getFullName() + " управляет автомобилем "
                + transport.getBrand() + " " + transport.getModel() +
                " и будет участвовать в заезде");
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
