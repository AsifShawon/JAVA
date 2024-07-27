package Task7;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(8, 128, true, 6.1, 999.99, "Samsung", "Android", "Snapdragon 888", 108, "5G");
        Laptop laptop = new Laptop(16, 512, false, 15.6, 1499.99, "Dell", "Windows", 2.5, true, "Aluminum", "Intel i7", "Nvidia RTX 3060");
        
        
        System.out.println("Phone Details:");
        System.out.println(phone);
        System.out.println("\nLaptop Details:");
        System.out.println(laptop);
    }
}

