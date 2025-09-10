
        //1
        class Book {
            String title;
            String author;
            double price;
            Book() {
                title = "Unknown";
                author = "Unknown";
                price = 0.0;
            }
            Book(String title, String author, double price) {
                this.title = title;
                this.author = author;
                this.price = price;
            }
            void display() {
                System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
            }
        }

//2
        class Circle {
            double radius;
            Circle() {
                this(1.0);
            }
            Circle(double radius) {
                this.radius = radius;
            }
            void display() {
                System.out.println("Circle Radius: " + radius);
            }
        }

//3
        class Person {
            String name;
            int age;
            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
            Person(Person other) {
                this.name = other.name;
                this.age = other.age;
            }
            void display() {
                System.out.println("Name: " + name + ", Age: " + age);
            }
        }

//4
        class HotelBooking {
            String guestName;
            String roomType;
            int nights;
            HotelBooking() {
                guestName = "Unknown";
                roomType = "Standard";
                nights = 1;
            }
            HotelBooking(String guestName, String roomType, int nights) {
                this.guestName = guestName;
                this.roomType = roomType;
                this.nights = nights;
            }
            HotelBooking(HotelBooking other) {
                this.guestName = other.guestName;
                this.roomType = other.roomType;
                this.nights = other.nights;
            }
            void display() {
                System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
            }
        }

//5
        class LibraryBook {
            String title;
            String author;
            double price;
            boolean available;
            LibraryBook(String title, String author, double price) {
                this.title = title;
                this.author = author;
                this.price = price;
                this.available = true;
            }
            void borrowBook() {
                if (available) {
                    available = false;
                    System.out.println(title + " borrowed successfully.");
                } else {
                    System.out.println(title + " is not available.");
                }
            }
            void display() {
                System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
            }
        }

//6
        class CarRental {
            String customerName;
            String carModel;
            int rentalDays;
            double costPerDay = 1000;
            CarRental(String customerName, String carModel, int rentalDays) {
                this.customerName = customerName;
                this.carModel = carModel;
                this.rentalDays = rentalDays;
            }
            double calculateTotalCost() {
                return rentalDays * costPerDay;
            }
            void display() {
                System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
            }
        }

//Main
        public class Sept_9_Assig {
            public static void main(String[] args) {
                //1
                Book b1 = new Book();
                Book b2 = new Book("Java Basics", "James Gosling", 499);
                b1.display();
                b2.display();

                //2
                Circle c1 = new Circle();
                Circle c2 = new Circle(5.5);
                c1.display();
                c2.display();

                //3
                Person p1 = new Person("Piyush", 19);
                Person p2 = new Person(p1);
                p1.display();
                p2.display();

                //4
                HotelBooking h1 = new HotelBooking();
                HotelBooking h2 = new HotelBooking("Rahul", "Deluxe", 3);
                HotelBooking h3 = new HotelBooking(h2);
                h1.display();
                h2.display();
                h3.display();

                //5
                LibraryBook lb = new LibraryBook("Data Structures", "Mark Allen", 799);
                lb.display();
                lb.borrowBook();
                lb.borrowBook();

                //6
                CarRental cr = new CarRental("Amit", "Honda City", 5);
                cr.display();
            }
        }



    
