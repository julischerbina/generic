package transport;

import Driver.Driver;
import Driver.DriverB;

public class Car extends Transport <DriverB> {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void maxSpeed() {
        int maxSpeed = (int) (Math.random() * 301);
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " " + "составила " + maxSpeed + " км/ч;");
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
    public void printInfo(Transport transport, Driver driver) {
        System.out.println("Водитель " + driver.getFullName() + " управляет автомобилем "
                + transport.getBrand() + " " + transport.getModel() +
                " и будет участвовать в заезде");
    }

}
