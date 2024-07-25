import java.util.List;
import java.util.Scanner;

public class BookingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingService bookingService = new BookingService();

        System.out.println("Welcome to the Booking System");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Save Booking");
            System.out.println("2. Display All Bookings");
            System.out.println("3. Search Flights");
            System.out.println("4. Display All Flights");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Flight ID: ");
                    String flightId = scanner.nextLine();  // Changed to String input
                    System.out.print("Enter Booking Status: ");
                    String status = scanner.nextLine();

                    Booking booking = bookingService.saveBooking(userId, flightId, status);
                    System.out.println("Booking saved: " + booking);
                    break;
                case 2:
                    bookingService.displayAllBookings();
                    break;
                case 3:
                    System.out.print("Enter Departure Location: ");
                    String departure = scanner.nextLine();
                    System.out.print("Enter Arrival Location: ");
                    String arrival = scanner.nextLine();
                    List<Flight> flights = bookingService.searchFlights(departure, arrival);
                    if (flights.isEmpty()) {
                        System.out.println("No flights found.");
                    } else {
                        System.out.println("Flights found:");
                        for (Flight flight : flights) {
                            System.out.println(flight);
                        }
                    }
                    break;
                case 4:
                    bookingService.displayAllFlights();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
