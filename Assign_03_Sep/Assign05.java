class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Assign05 {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("Apple", "iPhone 14", 80000);
        MobilePhone m2 = new MobilePhone("Samsung", "Galaxy S23", 70000);

        System.out.println("=== Mobile 1 ===");
        m1.displayDetails();

        System.out.println("\n=== Mobile 2 ===");
        m2.displayDetails();
    }
}
