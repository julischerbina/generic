package Driver;

import transportException.HavingLicenseException;

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


    public void setHaveDriveLicense(boolean haveDriveLicense) {
        if (haveDriveLicense) {
            this.haveDriveLicense = true;
        } else {
            try {
                throw new HavingLicenseException();
            } catch (HavingLicenseException e) {
                System.out.println("Необходимо указать тип прав у " + this.fullName);
            }
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
}
