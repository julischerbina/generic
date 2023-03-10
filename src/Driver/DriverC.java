package Driver;

import transportException.HavingLicenseException;

public class DriverC extends Driver{
    public DriverC(String fullName) {
        super(fullName);
    }

    public DriverC(String fullName, boolean haveDriveLicense, int experience) throws HavingLicenseException {
        super(fullName, haveDriveLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель с правами категории C по имени " + getFullName() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель с правами категории C по имени " + getFullName() + " закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель с правами категории C по имени " + getFullName() + " заправил машину");
    }
}
