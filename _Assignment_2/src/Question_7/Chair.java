package Question_7;

public class Chair extends Furniture {
    public Chair(String name, int hours) {
        super(name, hours);
    }

    @Override
    public double expenditure() {
        return 0.5 * hours;
    }
}
