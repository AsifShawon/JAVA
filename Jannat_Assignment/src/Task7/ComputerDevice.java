package Task7;

public class ComputerDevice {
    private int ram;
    private int rom;
    private boolean isTouchscreen;
    private double screenSize;
    private double price;
    private String brand;
    private String operatingSystem;

    // Constructor
    public ComputerDevice(int ram, int rom, boolean isTouchscreen, double screenSize, double price, String brand, String operatingSystem) {
        this.ram = ram;
        this.rom = rom;
        this.isTouchscreen = isTouchscreen;
        this.screenSize = screenSize;
        this.price = price;
        this.brand = brand;
        this.operatingSystem = operatingSystem;
    }

    // Getters
    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public boolean isTouchscreen() {
        return isTouchscreen;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    // Setters
    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public void setTouchscreen(boolean touchscreen) {
        isTouchscreen = touchscreen;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    // toString method
    @Override
    public String toString() {
        return "ComputerDevice{" +
                "ram=" + ram +
                ", rom=" + rom +
                ", isTouchscreen=" + isTouchscreen +
                ", screenSize=" + screenSize +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}

