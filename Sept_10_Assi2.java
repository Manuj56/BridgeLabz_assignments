package com.bridgelabz.oops.objectmodeling;

import java.util.*;

// Assisted Problem 1: Library and Books (Aggregation)
class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void show() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}

class Library {
    String name;
    List<Book> books = new ArrayList<>();
    Library(String name) {
        this.name = name;
    }
    void addBook(Book b) {
        books.add(b);
    }
    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) b.show();
    }
}

class LibraryTest {
    public static void main(String[] args) {
        Book b1 = new Book("Wings of Fire", "APJ Abdul Kalam");
        Book b2 = new Book("1984", "George Orwell");
        Library l1 = new Library("City Library");
        Library l2 = new Library("Town Library");
        l1.addBook(b1); l1.addBook(b2);
        l2.addBook(b1);
        l1.showBooks();
        l2.showBooks();
    }
}

// Assisted Problem 2: Bank and Account Holders (Association)
class Bank {
    String name;
    List<Customer> customers = new ArrayList<>();
    Bank(String name) {
        this.name = name;
    }
    void openAccount(Customer c) {
        customers.add(c);
        System.out.println("Account opened for " + c.name + " in " + name);
    }
}

class Customer {
    String name;
    double balance;
    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    void viewBalance() {
        System.out.println("Customer: " + name + ", Balance: " + balance);
    }
}

class BankTest {
    public static void main(String[] args) {
        Bank b = new Bank("SBI");
        Customer c1 = new Customer("Ravi", 5000);
        Customer c2 = new Customer("Sita", 7000);
        b.openAccount(c1);
        b.openAccount(c2);
        c1.viewBalance();
        c2.viewBalance();
    }
}

// Assisted Problem 3: Company and Departments (Composition)
class Company {
    String name;
    List<Department> depts = new ArrayList<>();
    Company(String name) {
        this.name = name;
    }
    void addDept(Department d) {
        depts.add(d);
    }
    void show() {
        System.out.println("Company: " + name);
        for (Department d : depts) d.show();
    }
}

class Department {
    String name;
    List<Employee> emps = new ArrayList<>();
    Department(String name) {
        this.name = name;
    }
    void addEmp(Employee e) {
        emps.add(e);
    }
    void show() {
        System.out.println("Dept: " + name);
        for (Employee e : emps) e.show();
    }
}

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("Employee: " + name);
    }
}

class CompanyTest {
    public static void main(String[] args) {
        Company c = new Company("Infosys");
        Department d1 = new Department("HR");
        Department d2 = new Department("IT");
        d1.addEmp(new Employee("Amit"));
        d2.addEmp(new Employee("Ravi"));
        c.addDept(d1);
        c.addDept(d2);
        c.show();
    }
}

// Self Problem 1: School and Students with Courses
class Course {
    String name;
    List<Student> students = new ArrayList<>();
    Course(String name) {
        this.name = name;
    }
    void addStudent(Student s) {
        students.add(s);
    }
    void show() {
        System.out.println("Course: " + name);
        for (Student s : students) System.out.println("Student: " + s.name);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();
    Student(String name) {
        this.name = name;
    }
    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }
    void showCourses() {
        System.out.println("Student: " + name + " enrolled in:");
        for (Course c : courses) System.out.println(c.name);
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();
    School(String name) {
        this.name = name;
    }
    void addStudent(Student s) {
        students.add(s);
    }
}

class SchoolTest {
    public static void main(String[] args) {
        School s = new School("City School");
        Student st1 = new Student("Rohan");
        Student st2 = new Student("Mohan");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        s.addStudent(st1);
        s.addStudent(st2);
        st1.enroll(c1);
        st1.enroll(c2);
        st2.enroll(c1);
        st1.showCourses();
        st2.showCourses();
        c1.show();
        c2.show();
    }
}

// Self Problem 2: University with Faculties and Departments
class University {
    String name;
    List<Dept> depts = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();
    University(String name) {
        this.name = name;
    }
    void addDept(Dept d) {
        depts.add(d);
    }
    void addFaculty(Faculty f) {
        faculties.add(f);
    }
    void show() {
        System.out.println("University: " + name);
        for (Dept d : depts) d.show();
        for (Faculty f : faculties) f.show();
    }
}

class Dept {
    String name;
    Dept(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("Dept: " + name);
    }
}

class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
    void show() {
        System.out.println("Faculty: " + name);
    }
}

class UniversityTest {
    public static void main(String[] args) {
        University u = new University("IIT");
        Dept d1 = new Dept("CSE");
        Dept d2 = new Dept("ECE");
        Faculty f1 = new Faculty("Dr. Amit");
        Faculty f2 = new Faculty("Dr. Sita");
        u.addDept(d1);
        u.addDept(d2);
        u.addFaculty(f1);
        u.addFaculty(f2);
        u.show();
    }
}

// Self Problem 3: Hospital, Doctors, and Patients
class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();
    Doctor(String name) {
        this.name = name;
    }
    void consult(Patient p) {
        patients.add(p);
        System.out.println("Doctor " + name + " consulted " + p.name);
    }
}

class Patient {
    String name;
    Patient(String name) {
        this.name = name;
    }
}

class Hospital {
    String name;
    List<Doctor> docs = new ArrayList<>();
    Hospital(String name) {
        this.name = name;
    }
    void addDoc(Doctor d) {
        docs.add(d);
    }
}

class HospitalTest {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Dr. Ravi");
        Doctor d2 = new Doctor("Dr. Sita");
        h.addDoc(d1);
        h.addDoc(d2);
        Patient p1 = new Patient("Rohan");
        Patient p2 = new Patient("Mohan");
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}

// Self Problem 4: E-commerce Platform
class ProductEC {
    String name;
    ProductEC(String name) {
        this.name = name;
    }
}

class Order {
    List<ProductEC> products = new ArrayList<>();
    void addProduct(ProductEC p) {
        products.add(p);
    }
    void show() {
        System.out.println("Order contains:");
        for (ProductEC p : products) System.out.println(p.name);
    }
}

class CustomerEC {
    String name;
    CustomerEC(String name) {
        this.name = name;
    }
    void placeOrder(Order o) {
        System.out.println("Customer " + name + " placed an order");
        o.show();
    }
}

class EcommerceTest {
    public static void main(String[] args) {
        CustomerEC c = new CustomerEC("Ravi");
        Order o = new Order();
        o.addProduct(new ProductEC("Phone"));
        o.addProduct(new ProductEC("Laptop"));
        c.placeOrder(o);
    }
}

// Self Problem 5: University Management System
class StudentUMS {
    String name;
    List<CourseUMS> courses = new ArrayList<>();
    StudentUMS(String name) {
        this.name = name;
    }
    void enrollCourse(CourseUMS c) {
        courses.add(c);
        System.out.println(name + " enrolled in " + c.name);
    }
}

class ProfessorUMS {
    String name;
    ProfessorUMS(String name) {
        this.name = name;
    }
    void assignCourse(CourseUMS c) {
        System.out.println("Professor " + name + " assigned to " + c.name);
    }
}

class CourseUMS {
    String name;
    CourseUMS(String name) {
        this.name = name;
    }
}

class UniversitySystemTest {
    public static void main(String[] args) {
        StudentUMS s1 = new StudentUMS("Amit");
        ProfessorUMS p = new ProfessorUMS("Dr. Sita");
        CourseUMS c1 = new CourseUMS("Math");
        s1.enrollCourse(c1);
        p.assignCourse(c1);
    }
}
