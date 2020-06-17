public class Train implements Driving {
    @Override
    public void drive() {
        System.out.println("GO!");
    }

    @Override
    public void reverse() {
        System.out.println("W8 a sec ¯|_(ツ)_/¯");
    }
}
