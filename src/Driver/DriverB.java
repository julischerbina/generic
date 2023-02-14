package Driver;

import transportException.HavingLicenseException;

public class DriverB extends Driver{
    public DriverB(String fullName) {
        super(fullName);
    }

    public DriverB(String fullName, boolean haveDriveLicense, int experience) throws HavingLicenseException {
        super(fullName, haveDriveLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель с правами категории В по имени " + getFullName() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель с правами категории В по имени " + getFullName() + " закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель с правами категории В по имени " + getFullName() + " заправил машину");
    }
}
