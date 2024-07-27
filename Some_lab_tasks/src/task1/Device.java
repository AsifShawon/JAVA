package task1;

public class Device implements Operable {
    private String brand;
    private String model;
    private User user;
    
    public Device(String brand, String model, User user) {
        this.brand = brand;
        this.model = model;
        this.user = user;
    }
    
    @Override
    public void start() {
        System.out.println("Device is starting");
    }
    
    @Override
    public void shutdown() {
        System.out.println("Device is shutting down");
    }
    
    public User getUser() {
        return user;
    }
}

