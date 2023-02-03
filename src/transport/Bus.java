package transport;

import Driver.DriverD;

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
    public void printType() {
        if (capacity != null) {
            System.out.println(capacity);
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

    public static void printInfo(Transport transport, DriverD driverD) {
        System.out.println("Водитель " + driverD.getFullName() + " управляет автобусом "
                + transport.getBrand() + " " + transport.getModel() +
                " и будет участвовать в заезде");
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}

