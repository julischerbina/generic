package transport;

import Driver.Driver;
import Driver.DriverC;

public class Truck extends Transport <DriverC>{
    private Carring carring;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 Carring carring) {
        super(brand, model, engineVolume);
        this.carring = carring;
    }

    public void maxSpeed() {
        int maxSpeed = (int)(Math.random() * 181);
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " " + "составила " + maxSpeed + " км/ч;");
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Грузовик " + getBrand() + getModel() + " отправлен на диагностику");
    }

    public void printType() {
        if (carring != null) {
            System.out.println(carring);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
    @Override
        public void pitStop (Transport transport) {
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
    /*public void printInfo(Driver driverC) {
        System.out.println("Водитель " + driverC.getFullName() + " управляет грузовиком "
                + getBrand() + " " + getModel() +
                " и будет участвовать в заезде");
    }*/

    public Carring getCarring() {
        return carring;
    }

    public void setCarring(Carring carring) {
        this.carring = carring;
    }
}
