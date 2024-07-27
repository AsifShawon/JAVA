package Task7;

public class Phone extends ComputerDevice {
    private String chipset;
    private int cameraResolutionMP;
    private String network;

    public Phone(int ram, int rom, boolean isTouchscreen, double screenSize, double price, String brand, String operatingSystem, String chipset, int cameraResolutionMP, String network) {
        super(ram, rom, isTouchscreen, screenSize, price, brand, operatingSystem);
        this.chipset = chipset;
        this.cameraResolutionMP = cameraResolutionMP;
        this.network = network;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public int getCameraResolutionMP() {
        return cameraResolutionMP;
    }

    public void setCameraResolutionMP(int cameraResolutionMP) {
        this.cameraResolutionMP = cameraResolutionMP;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "chipset='" + chipset + '\'' +
                ", cameraResolutionMP=" + cameraResolutionMP +
                ", network='" + network + '\'' +
                "} " + super.toString();
    }
}