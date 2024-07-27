package task1;

public class Computer extends Device {
    private String type;
    private OperatingSystem os;
    
    public Computer(String brand, String model, String type, User user, OperatingSystem os) {
        super(brand, model, user);
        this.type = type;
        this.os = os;
    }
    
    @Override
    public void start() {
        System.out.println("Computer is starting");
    }
    
    @Override
    public void shutdown() {
        System.out.println("Computer is shutting down");
    }
    
    public String getType() {
        return type;
    }
    
    public OperatingSystem getOperatingSystem() {
        return os;
    }
}
