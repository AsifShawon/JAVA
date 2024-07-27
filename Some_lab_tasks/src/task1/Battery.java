package task1;

public class Battery {
    private int capacity;
    private String type;

    public Battery(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }
}
