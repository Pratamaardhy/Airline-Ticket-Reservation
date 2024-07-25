public class Flight {
    private String flightId;
    private String flightNumber;
    private String departure;
    private String arrival;
    private String date;
    private String time;
    private int availability;

    // Constructor
    public Flight(String flightId, String flightNumber, String departure, String arrival, String date, String time, int availability) {
        this.flightId = flightId;
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.date = date;
        this.time = time;
        this.availability = availability;
    }

    // Getters and setters
    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId='" + flightId + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", availability=" + availability +
                '}';
    }
}

