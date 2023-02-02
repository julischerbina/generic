package Driver;

public class DriverC extends Driver{
    public DriverC(String fullName) {
        super(fullName);
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
