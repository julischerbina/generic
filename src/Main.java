import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import transport.*;
import transportException.DiagnosticFailedException;
import transportException.HavingLicenseException;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Bus bus1 = new Bus("Икарус", "первый", 5, Capacity.MIDDLE);
        Bus bus2 = new Bus("Икарус", "второй", 4, Capacity.BIG);
        Bus bus3 = new Bus("Икарус", "третий", 6, Capacity.EXTRA_SMALL);
        Bus bus4 = new Bus("Икарус", "четвертый", 3.5, Capacity.SMALL);

        DriverB driverB;
        try {
            driverB = new DriverB("A", true, 3);
        } catch (HavingLicenseException e) {
            System.out.println("Укажите тип прав!");
            throw new RuntimeException(e);
        }
        DriverC driverC;
        try {
            driverC = new DriverC("C", true, 5);
        } catch (HavingLicenseException e) {
            System.out.println("Укажите тип прав!");
            throw new RuntimeException(e);
        }
        DriverD driverD;
        try {
            driverD = new DriverD("D", true, 5);
        } catch (HavingLicenseException e) {
            System.out.println("Укажите тип прав!");
            throw new RuntimeException(e);
        }

        Car car1 = new Car("Audi", "tt", 5, BodyType.SEDAN);
        Car car2 = new Car("Audi", "aa", 4.5, BodyType.SEDAN);
        Car car3 = new Car("Audi", "vv", 5.5, BodyType.CUPE);
        Car car4 = new Car("Audi", "bb", 5, BodyType.UNIVERSAL);
        Truck truck1 = new Truck("Man", "big", 10, Carring.N1);
        Truck truck2 = new Truck("Man", "big2", 12, Carring.N2);
        Truck truck3 = new Truck("Man", "big3", 14, Carring.N3);
        Truck truck4 = new Truck("Man", "big4", 16, Carring.N2);

        Mehanic mehanic1 = new Mehanic("Vanya Ivanov", "Fixing your car");
        Mehanic mehanic4 = new Mehanic("Vanya Ivanov", "Fixing your car");
        Mehanic mehanic2 = new Mehanic("Petya Petrov", "Fix your car");
        Mehanic mehanic3 = new Mehanic("Senya Sidorov", "Fixiki");

        //       car3.addMehanics(mehanic1);
        car3.addMehanics(mehanic2);
        car3.addMehanics(mehanic2);
        car2.addMehanics(mehanic1);
        car2.addMehanics(mehanic1);
        car2.addMehanics(mehanic4);
//        car2.addMehanics(mehanic3);
//        truck2.addMehanics(mehanic1);
//        truck2.addMehanics(mehanic2);
//        truck2.addMehanics(mehanic3);
//        bus3.addMehanics(mehanic1);
        car3.addDrivers(driverB);
        car2.addDrivers(driverB);
//        truck2.addDrivers(driverC);
//        bus3.addDrivers(driverD);


        List<Transport<?>> racers = new ArrayList<>();
        racers.add(car2);
        racers.add(car3);
//        racers.add(truck2);
//        racers.add(bus3);


        List<Driver> drivers = new ArrayList<>();
        drivers.add(driverB);
        drivers.add(driverC);
        drivers.add(driverD);
        //System.out.println(drivers);

        STO sto = new STO();
        sto.addTransport(car3);
        sto.addTransport(bus1);
        sto.addTransport(truck2);

        Map<Transport<?>, Set<Mehanic>> transportMehanicMap = new HashMap<>();

        for (Transport<?> transport : racers) {
            transportMehanicMap.put(transport, transport.getMehanics());
            System.out.println("У  " + transport + " Водитель: " + transport.getDrivers() + " , Механики: " + transport.getMehanics());
        }

        System.out.println(transportMehanicMap);

//        sto.runTO();
//        sto.runTO();
//        sto.runTO();

        /*truck1.startMoving();
        truck1.stopMoving();
        bus2.pitStop(bus2);
        bus3.bestLapTime();
        car2.bestLapTime();
        bus3.maxSpeed();
        car1.maxSpeed();

        first.refuelCar();
        first.startMoving();
        first.stopMoving();

        DriverC driverC = new DriverC("K");
        DriverD driverD = new DriverD("F");*/

        //car1.printInfo(first);
        //bus3.printInfo(driverD);
        //truck1.printInfo(driverC);

        //car3.printType();
        //printInfo(car1, driverC);
        //car1.passDiagnostics();
        //bus3.passDiagnostics();
        //сheckDiagnostic(car1, car2, truck1, bus1);
        //truck1.passDiagnostics();




    /*public static void printInfo(Transport<?> transport, Driver driver) {
        System.out.println("Водитель " + driver.getFullName() + " управляет автомобилем "
                + transport.getBrand() + " " + transport.getModel() +
                " и будет участвовать в заезде");
    }

    public static void сheckDiagnostic(Transport... transports) {
        for (Transport transport : transports) {
            try {
                transport.passDiagnostics();
            } catch (DiagnosticFailedException e) {
                System.out.println("Произошла ошибка с транспортным средством " + e.getTransport().getBrand() + " " + e.getTransport().getModel());
                System.out.println(e.getMessage());
            }
        }*/
    }
}