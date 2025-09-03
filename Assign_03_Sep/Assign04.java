class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
    }
}

public class Assign04 {
    public static void main(String[] args) {
        Item i1 = new Item(101, "Pen", 10);
        Item i2 = new Item(102, "Notebook", 50);

        System.out.println("=== Item 1 ===");
        i1.displayDetails();
        System.out.println("Total cost for 5 units: " + i1.calculateTotalCost(5));

        System.out.println("\n=== Item 2 ===");
        i2.displayDetails();
        System.out.println("Total cost for 3 units: " + i2.calculateTotalCost(3));
    }
}
