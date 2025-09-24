// ------------------- Problem 1: Employee Management System -------------------
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }

    public double getBaseSalary() { return baseSalary; }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String dept;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() { return getBaseSalary(); }

    public void assignDepartment(String dept) { this.dept = dept; }
    public String getDepartmentDetails() { return "Department: " + dept; }
}

class PartTimeEmployee extends Employee implements Department {
    private String dept;
    private int hoursWorked;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() { return getBaseSalary() * hoursWorked; }

    public void assignDepartment(String dept) { this.dept = dept; }
    public String getDepartmentDetails() { return "Department: " + dept; }
}

// ------------------- Problem 2: E-Commerce Platform -------------------
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId; this.name = name; this.price = price;
    }

    public abstract double calculateDiscount();
    public double getPrice() { return price; }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.1; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "18% GST"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.2; }
    public double calculateTax() { return getPrice() * 0.05; }
    public String getTaxDetails() { return "5% GST"; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.05; }
}

// ------------------- Problem 3: Vehicle Rental System -------------------
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber; this.type = type; this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
    public double getRentalRate() { return rentalRate; }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String no, double rate) { super(no, "Car", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 5000; }
    public String getInsuranceDetails() { return "Car insurance fixed 5000"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String no, double rate) { super(no, "Bike", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 2000; }
    public String getInsuranceDetails() { return "Bike insurance fixed 2000"; }
}

// ------------------- Problem 4: Banking System -------------------
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accNo, String holder, double bal) {
        this.accountNumber = accNo; this.holderName = holder; this.balance = bal;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }
    public abstract double calculateInterest();
    public double getBalance() { return balance; }
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String no, String name, double bal) { super(no, name, bal); }
    public double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan(double amount) { System.out.println("Savings Loan applied: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}

// ------------------- Problem 5: Library Management System -------------------
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int id, String title, String author) {
        this.itemId = id; this.title = title; this.author = author;
    }

    public abstract int getLoanDuration();
    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean reserved = false;
    public Book(int id, String t, String a) { super(id, t, a); }
    public int getLoanDuration() { return 14; }
    public void reserveItem() { reserved = true; }
    public boolean checkAvailability() { return !reserved; }
}

// ------------------- Problem 6: Online Food Delivery System -------------------
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int qty) {
        this.itemName = name; this.price = price; this.quantity = qty;
    }

    public abstract double calculateTotalPrice();
    public void getItemDetails() {
        System.out.println(itemName + " - " + quantity + " pcs @ " + price);
    }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    public double applyDiscount() { return calculateTotalPrice() * 0.1; }
    public String getDiscountDetails() { return "10% discount"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return (getPrice() * getQuantity()) + 50; }
    public double applyDiscount() { return calculateTotalPrice() * 0.05; }
    public String getDiscountDetails() { return "5% discount"; }
}

// ------------------- Problem 7: Hospital Patient Management -------------------
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id; this.name = name; this.age = age;
    }

    public abstract double calculateBill();
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private String record;
    private int days;
    public InPatient(int id, String name, int age, int days) { super(id, name, age); this.days = days; }
    public double calculateBill() { return days * 2000; }
    public void addRecord(String record) { this.record = record; }
    public void viewRecords() { System.out.println("Record: " + record); }
}

// ------------------- Problem 8: Ride-Hailing Application -------------------
abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String id, String driver, double rate) {
        this.vehicleId = id; this.driverName = driver; this.ratePerKm = rate;
    }

    public abstract double calculateFare(double distance);
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName);
    }
    public double getRatePerKm() { return ratePerKm; }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String loc);
}

class CarRide extends RideVehicle implements GPS {
    private String location;
    public CarRide(String id, String driver, double rate) { super(id, driver, rate); }
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String loc) { this.location = loc; }
}

// ------------------- Main Class -------------------
public class Sep_20 {
    public static void main(String[] args) {
        System.out.println("--- Employee Management ---");
        Employee e1 = new FullTimeEmployee(1, "Amit", 50000);
        Employee e2 = new PartTimeEmployee(2, "Ravi", 500, 20);
        e1.displayDetails();
        System.out.println("Salary: " + e1.calculateSalary());
        e2.displayDetails();
        System.out.println("Salary: " + e2.calculateSalary());

        System.out.println("\n--- E-Commerce ---");
        Product p1 = new Electronics(101, "Laptop", 60000);
        Product p2 = new Clothing(102, "Shirt", 2000);
        System.out.println("Laptop Final Price: " + (p1.getPrice() + ((Taxable)p1).calculateTax() - p1.calculateDiscount()));
        System.out.println("Shirt Final Price: " + (p2.getPrice() + ((Taxable)p2).calculateTax() - p2.calculateDiscount()));

        System.out.println("\n--- Vehicle Rental ---");
        Vehicle v1 = new Car("UP32AB1234", 1500);
        System.out.println("Car 3 days cost: " + v1.calculateRentalCost(3));

        System.out.println("\n--- Banking ---");
        SavingsAccount acc = new SavingsAccount("ACC123", "Raj", 20000);
        System.out.println("Interest: " + acc.calculateInterest());
        System.out.println("Loan Eligible: " + acc.calculateLoanEligibility());

        System.out.println("\n--- Library ---");
        Book book = new Book(201, "Java Programming", "James Gosling");
        book.getItemDetails();
        System.out.println("Loan Duration: " + book.getLoanDuration());

        System.out.println("\n--- Food Delivery ---");
        FoodItem f1 = new VegItem("Paneer", 200, 2);
        System.out.println("Total Price: " + f1.calculateTotalPrice());

        System.out.println("\n--- Hospital ---");
        Patient ptn = new InPatient(301, "Sita", 30, 5);
        ptn.getPatientDetails();
        System.out.println("Bill: " + ptn.calculateBill());

        System.out.println("\n--- Ride Hailing ---");
        CarRide ride = new CarRide("C101", "DriverA", 15);
        System.out.println("Fare for 10 km: " + ride.calculateFare(10));
    }
}

