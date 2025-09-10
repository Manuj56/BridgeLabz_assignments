

// 1. Product Inventory
class Product {
    String name;
    double price;
    static int total = 0;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        total++;
    }

    void show() {
        System.out.println("Product: " + name + ", Price: " + price);
    }

    static void showTotal() {
        System.out.println("Total Products: " + total);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Pen", 10);
        Product p2 = new Product("Book", 50);
        p1.show();
        p2.show();
        Product.showTotal();
    }
}

// 2. Online Course Management
class Course {
    String name;
    int duration;
    double fee;
    static int total = 0;

    Course(String name, int duration, double fee) {
        this.name = name;
        this.duration = duration;
        this.fee = fee;
        total++;
    }

    void show() {
        System.out.println("Course: " + name + ", Duration: " + duration + " months, Fee: " + fee);
    }

    static void showTotal() {
        System.out.println("Total Courses: " + total);
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 5000);
        Course c2 = new Course("Python", 2, 4000);
        c1.show();
        c2.show();
        Course.showTotal();
    }
}

// 3. Library System
class Library {
    String title;
    String author;
    static int total = 0;

    Library(String title, String author) {
        this.title = title;
        this.author = author;
        total++;
    }

    void show() {
        System.out.println("Book: " + title + ", Author: " + author);
    }

    static void showTotal() {
        System.out.println("Total Books: " + total);
    }

    public static void main(String[] args) {
        Library b1 = new Library("Wings of Fire", "APJ Abdul Kalam");
        Library b2 = new Library("1984", "George Orwell");
        b1.show();
        b2.show();
        Library.showTotal();
    }
}

// 4. Employee Management
class Employee {
    String name;
    double salary;
    static int total = 0;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        total++;
    }

    void show() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }

    static void showTotal() {
        System.out.println("Total Employees: " + total);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 30000);
        Employee e2 = new Employee("Ravi", 40000);
        e1.show();
        e2.show();
        Employee.showTotal();
    }
}

// 5. Bank Account Management
class Bank {
    String name;
    double balance;
    static int total = 0;

    Bank(String name, double balance) {
        this.name = name;
        this.balance = balance;
        total++;
    }

    void show() {
        System.out.println("Account Holder: " + name + ", Balance: " + balance);
    }

    static void showTotal() {
        System.out.println("Total Accounts: " + total);
    }

    public static void main(String[] args) {
        Bank a1 = new Bank("Sita", 20000);
        Bank a2 = new Bank("Gita", 50000);
        a1.show();
        a2.show();
        Bank.showTotal();
    }
}

// 6. School Student Management
class School {
    String name;
    int age;
    static int total = 0;

    School(String name, int age) {
        this.name = name;
        this.age = age;
        total++;
    }

    void show() {
        System.out.println("Student: " + name + ", Age: " + age);
    }

    static void showTotal() {
        System.out.println("Total Students: " + total);
    }

    public static void main(String[] args) {
        School s1 = new School("Rohan", 15);
        School s2 = new School("Mohan", 14);
        s1.show();
        s2.show();
        School.showTotal();
    }
}

// 7. Hospital Management
class Patient {
    static String hospital;
    static int total = 0;
    String id;
    String name;
    int age;
    String problem;

    Patient(String id, String name, int age, String problem) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.problem = problem;
        total++;
    }

    static void setHospital(String h) {
        hospital = h;
    }

    void show() {
        System.out.println("Hospital: " + hospital);
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Problem: " + problem);
    }

    static void showTotal() {
        System.out.println("Total Patients: " + total);
    }

    public static void main(String[] args) {
        Patient.setHospital("City Hospital");
        Patient pat1 = new Patient("P001", "Lathika", 30, "Flu");
        Patient pat2 = new Patient("P002", "Lidiya", 45, "Fracture");
        pat1.show();
        pat2.show();
        Patient.showTotal();
    }
}
