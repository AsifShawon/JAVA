package Question_7;

public class Table extends Furniture {
    public Table(String name, int hours) {
        super(name, hours);
    }

    @Override
    public double expenditure() {
        return 2 * hours;
    }
}
