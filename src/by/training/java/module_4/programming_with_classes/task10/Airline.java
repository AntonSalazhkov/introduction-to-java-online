package by.training.java.module_4.programming_with_classes.task10;

public class Airline {

    private String destination;
    private int flightNumber;
    private String aircraftType;
    private String departureTime;
    private String daysOfTheWeek;
    //пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

    public Airline(String destination, int flightNumber, String aircraftType, String departureTime, String daysOfTheWeek) {
        setDestination(destination);
        setFlightNumber(flightNumber);
        setAircraftType(aircraftType);
        setDepartureTime(departureTime);
        setDaysOfTheWeek(daysOfTheWeek);
    }

    public static void toString(Airline[] airline) {
        for (int i = 0; i < airline.length; i++) {
            System.out.println(airline[i].getString());
        }
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(String daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public String getString() {
        return "Destination: " + getDestination() + ", flight number: " + getFlightNumber() + ", aircraft type: "
                + getAircraftType() + ", departure time: " + getDepartureTime() + ", days of the week: " + getDaysOfTheWeek();
    }
}