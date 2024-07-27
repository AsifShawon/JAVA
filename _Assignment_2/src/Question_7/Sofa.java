package Question_7;

public class Sofa extends Furniture {
    public Sofa(String name, int hours) {
        super(name, hours);
    }

    @Override
    public double expenditure() {
        return 5 * hours;
    }
}
