import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Cargo;
import transport.Transport;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Bus bus1 = new Bus("Икарус", "первый", 5);
        Bus bus2 = new Bus("Икарус", "второй", 4);
        Bus bus3 = new Bus("Икарус", "третий", 6);
        Bus bus4 = new Bus("Икарус", "четвертый", 3.5);
        DriverB first = new DriverB("A");
        Car car1 = new Car("Audi", "tt", 5);
        Car car2 = new Car("Audi", "aa", 4.5);
        Car car3 = new Car("Audi", "vv", 5.5);
        Car car4 = new Car("Audi", "bb", 5);
        Cargo cargo1 = new Cargo("Man", "big", 10);
        Cargo cargo2 = new Cargo("Man", "big2", 12);
        Cargo cargo3 = new Cargo("Man", "big3", 14);
        Cargo cargo4 = new Cargo("Man", "big4", 16);

        cargo1.startMoving();
        cargo1.stopMoving();
        bus2.pitStop(bus2);
        bus3.bestLapTime();
        car2.bestLapTime();
        bus3.maxSpeed();
        car1.maxSpeed();

        first.refuelCar();
        first.startMoving();
        first.stopMoving();

        DriverC driverC = new DriverC("K");
        DriverD driverD = new DriverD("F");

        car1.printInfo(car1, first);
        bus3.printInfo(bus3, driverD);
        cargo1.printInfo(cargo1, driverC);
    }
}