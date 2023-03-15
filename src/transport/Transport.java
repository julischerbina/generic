package transport;

import Driver.Driver;
import transportException.DiagnosticFailedException;

import java.util.*;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    static final String defaultValue = "default";
    static final double defaultEngineVolume = 1.5;
    private final Map<Transport<?>, Mehanic> mehanics = new HashMap<>();

    private final Set<Driver> drivers = new HashSet<Driver>();


    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isBlank()) {
            this.brand = defaultValue;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = defaultValue;
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void printType();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = defaultEngineVolume;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    //public abstract void printInfo(Driver driver);

    @Override
    public void pitStop(Transport transport) {

    }

    @Override
    public void bestLapTime() {

    }

    @Override
    public void maxSpeed() {

    }

    public abstract void passDiagnostics() throws DiagnosticFailedException;

    public Map<Transport<?>, Mehanic> getMehanics() {
        return mehanics;
    }

    public void addMehanics(Transport<?> transport, Mehanic mehanic) {
        mehanics.put(transport, mehanic);
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }
    public void addDrivers(Driver driver) {
        drivers.add(driver);
    }
}
