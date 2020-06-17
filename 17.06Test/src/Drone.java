public class Drone implements Moving {
    @Override
    public void drive() {
        System.out.println("Drives");
    }

    @Override
    public void reverse() {
        System.out.println("Stops");
    }

    @Override
    public void fly() {
        System.out.println("Flies");
    }
}
