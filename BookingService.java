import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<Booking> bookings = new ArrayList<>();
    private List<Flight> flights = new ArrayList<>();
    private int bookingCounter = 1;

    public BookingService() {
        // Initialize some flights for demonstration purposes
        flights.add(new Flight("FL123", "AA101", "New York", "Los Angeles", "2024-07-25", "10:00", 100));
        flights.add(new Flight("FL124", "AA102", "Chicago", "Miami", "2024-07-26", "12:00", 50));
    }

    // Method to save booking
    public Booking saveBooking(int userId, String flightId, String status) {
        String createdAt = java.time.LocalDateTime.now().toString();
        Booking booking = new Booking(bookingCounter++, userId, flightId, status, createdAt);
        bookings.add(booking);
        return booking;
    }

    // Method to display all bookings
    public void displayAllBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }

    // Method to search flights
    public List<Flight> searchFlights(String departure, String arrival) {
        List<Flight> results = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equalsIgnoreCase(departure) && flight.getArrival().equalsIgnoreCase(arrival)) {
                results.add(flight);
            }
        }
        return results;
    }

    // Method to display all flights
    public void displayAllFlights() {
        if (flights.isEmpty()) {
            System.out.println("No flights found.");
        } else {
            for (Flight flight : flights) {
                System.out.println(flight);
            }
        }
    }
}
