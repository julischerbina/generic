package Driver;

public class DriverD extends Driver{
    public DriverD(String fullName) {
        super(fullName);
    }
    @Override
    public void startMoving() {
        System.out.println("Водитель с правами категории D по имени " + getFullName() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель с правами категории D по имени " + getFullName() + " закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель с правами категории D по имени " + getFullName() + " заправил машину");
    }
}
