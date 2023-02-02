package transport;

import Driver.DriverC;
import Driver.DriverD;

public class Cargo extends Transport <DriverC>{

    public Cargo(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void maxSpeed() {
        int maxSpeed = (int)(Math.random() * 181);
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " " + "составила " + maxSpeed + " км/ч;");
    }
    @Override
    public void pitStop(Transport transport) {
        System.out.println(transport.getBrand() + " " + transport.getModel() + " зашел на пит-стоп;");
    }

    @Override
    public void bestLapTime() {
        double maxLapTime = (Math.random() * 3 + 6);
        System.out.printf("Лучшее время круга у " + getBrand() + " " + getModel() + " " + "составило %.2f;", maxLapTime);
        System.out.println();
    }

    public void startMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }
    public void stopMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }
    public static void printInfo(Transport transport, DriverC driverC) {
        System.out.println("Водитель " + driverC.getFullName() + " управляет грузовиком "
                + transport.getBrand() + " " + transport.getModel() +
                " и будет участвовать в заезде");
    }
}
