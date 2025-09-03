public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket(String newSeat, double newPrice) {
        this.seatNumber = newSeat;
        this.price = newPrice;
        System.out.println("Ticket booked successfully!");
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("Inception", "A10", 250);
        t1.displayDetails();
        t1.bookTicket("B15", 300);
        t1.displayDetails();
    }
}
