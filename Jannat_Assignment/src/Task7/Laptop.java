package Task7;

public class Laptop extends ComputerDevice {
    private double weight;
    private boolean isKeyboardFullSize;
    private String material;
    private String cpu;
    private String gpu;

    public Laptop(int ram, int rom, boolean isTouchscreen, double screenSize, double price, String brand, String operatingSystem, double weight, boolean isKeyboardFullSize, String material, String cpu, String gpu) {
        super(ram, rom, isTouchscreen, screenSize, price, brand, operatingSystem);
        this.weight = weight;
        this.isKeyboardFullSize = isKeyboardFullSize;
        this.material = material;
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isKeyboardFullSize() {
        return isKeyboardFullSize;
    }

    public void setKeyboardFullSize(boolean keyboardFullSize) {
        isKeyboardFullSize = keyboardFullSize;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                ", isKeyboardFullSize=" + isKeyboardFullSize +
                ", material='" + material + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                "} " + super.toString();
    }
}