package Driver;

public abstract class Driver {
    private String fullName;
    private boolean haveDriveLicense;
    private int experience;

    public Driver(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isHaveDriveLicense() {
        return haveDriveLicense;
    }

    public void setHaveDriveLicense(boolean haveDriveLicense) {
        this.haveDriveLicense = haveDriveLicense;
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
