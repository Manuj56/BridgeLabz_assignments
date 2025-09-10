//1.1 Product Inventory
class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

//1.2 Online Course Management
class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }
}

//1.3 Vehicle Registration
class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}

//2.1 University Management System
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    String thesisTopic;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTopic) {
        super(rollNumber, name, CGPA);
        this.thesisTopic = thesisTopic;
    }

    void displayDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA() + ", Thesis: " + thesisTopic);
    }
}

//2.2 Book Library System
class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    String fileSize;

    EBook(String ISBN, String title, String author, String fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor() + ", File Size: " + fileSize);
    }
}

//2.3 Bank Account Management
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displayDetails() {
        System.out.println("Acc No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance() + ", Interest: " + interestRate + "%");
    }
}

//2.4 Employee Records
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    String project;

    Manager(int employeeID, String department, double salary, String project) {
        super(employeeID, department, salary);
        this.project = project;
    }

    void displayDetails() {
        System.out.println("ID: " + employeeID + ", Dept: " + department + ", Salary: " + getSalary() + ", Project: " + project);
    }
}

//Main
public class Main {
    public static void main(String[] args) {
        //1.1
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Phone", 20000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();

        //1.2
        Course c1 = new Course("Java", 3, 15000);
        c1.displayCourseDetails();
        Course.updateInstituteName("XYZ Academy");
        c1.displayCourseDetails();

        //1.3
        Vehicle v1 = new Vehicle("Piyush", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000);
        v1.displayVehicleDetails();

        //2.1
        PostgraduateStudent pg = new PostgraduateStudent(101, "Aman", 8.5, "AI Research");
        pg.displayDetails();

        //2.2
        EBook eb = new EBook("123-456", "Java OOP", "James", "5MB");
        eb.displayDetails();

        //2.3
        SavingsAccount sa = new SavingsAccount("ACC101", "Rahul", 5000, 5);
        sa.deposit(2000);
        sa.displayDetails();

        //2.4
        Manager m = new Manager(1, "IT", 60000, "Cloud Migration");
        m.displayDetails();
    }
}
