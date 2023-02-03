import Driver.DriverB;
import transport.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Bus bus1 = new Bus("Икарус", "первый", 5, Capacity.MIDDLE);
        Bus bus2 = new Bus("Икарус", "второй", 4, Capacity.BIG);
        Bus bus3 = new Bus("Икарус", "третий", 6, Capacity.EXTRA_SMALL);
        Bus bus4 = new Bus("Икарус", "четвертый", 3.5, Capacity.SMALL);
        DriverB first = new DriverB("A");
        Car car1 = new Car("Audi", "tt", 5, BodyType.SEDAN);
        Car car2 = new Car("Audi", "aa", 4.5, BodyType.SEDAN);
        Car car3 = new Car("Audi", "vv", 5.5, BodyType.CUPE);
        Car car4 = new Car("Audi", "bb", 5, BodyType.UNIVERSAL);
        Truck truck1 = new Truck("Man", "big", 10, Carring.N1);
        Truck truck2 = new Truck("Man", "big2", 12, Carring.N2);
        Truck truck3 = new Truck("Man", "big3", 14, Carring.N3);
        Truck truck4 = new Truck("Man", "big4", 16, Carring.N2);

        /*cargo1.startMoving();
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
        cargo1.printInfo(cargo1, driverC);*/

        car3.printType();
    }
}