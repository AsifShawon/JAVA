package task1;

public class OperatingSystem {
    private String name;
    private String version;
    
    public OperatingSystem(String name, String version) {
        this.name = name;
        this.version = version;
    }
    
    public String getName() {
        return name;
    }
    
    public String getVersion() {
        return version;
    }
}
