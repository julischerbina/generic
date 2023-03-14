package Driver;

import transportException.HavingLicenseException;

import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean haveDriveLicense;
    private int experience;

    public Driver(String fullName) {
        this.fullName = fullName;
    }

    public Driver(String fullName, boolean haveDriveLicense, int experience) throws HavingLicenseException {
        this(fullName);
        setHaveDriveLicense(haveDriveLicense);
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isHaveDriveLicense(){
        return haveDriveLicense;
    }


    public void setHaveDriveLicense(boolean haveDriveLicense) throws HavingLicenseException {
        if (haveDriveLicense) {
            this.haveDriveLicense = true;
        } else {
                throw new HavingLicenseException();
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMoving();
    public abstract void stopMoving();

    public abstract void refuelCar();

    @Override
    public String toString() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return haveDriveLicense == driver.haveDriveLicense && experience == driver.experience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, haveDriveLicense, experience);
    }
}
