package com.canessa.calcengine;


/**
 * 
 */
public class Flight {

    // **** ****
    private int passengers = 0;
    private int seats = 15;
    private int totalCheckedBags;

    private boolean[] isSeatAvailable = new boolean[seats];
    private int flightNumber;
    private char flightClass;

    private static int allPassengers;
    private static int maxPassengersPerFlight;


    // /**
    //  * Constructor.
    //  */
    // public Flight() {
    //     this.seats = 15;
    //     this.passengers = 0;
    // }


    // **** initialization block ****
    {
        //this.seats = 15;

        for (int i = 0; i < this.seats; i++)
            isSeatAvailable[i] = true;
    }


    // **** static initialization block ****
    static {
        // AdminService admin = new AdminService();
        // admin.connect();
        // maxPassengersPerFlight = admin.isRestricted() ? admin.getMaxFlightPassengers() : Integer.MAX_VALUE;
        // admin.close();

        maxPassengersPerFlight = Integer.MAX_VALUE;
    }


    /**
     * Default constructor.
     */
    public Flight() {}


    /**
     * Constructor.
     * @param flightNumber
     */
    public Flight(int flightNumber) {

        // // **** run default constructor ****
        // this();

        this.flightNumber = flightNumber;
    }


    /**
     * Constructor.
     * @param flightClass
     */
    public Flight(char flightClass) {

        // // **** run default constructor ****
        // this();

        this.flightClass = flightClass;
    }

    /**
     * Get flight number.
     * @return
     */
    public int getFlightNumber() {
        return this.flightNumber;
    }


    /**
     * Set flight number.
     * @param flightNumber
     */
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * Used to access allPassengers static filed value.
     * @return
     */
    public static int getAllPassengers() {
        return allPassengers;
    }

    /**
     * Reset the static field allPassengers.
     */
    public static void resetAllPassengers() {
        allPassengers = 0;
    }



    /**
     * Add a passenger.
     */
    public void add1Passenger() {

        // **** add a passenger (if possible) ****
        //if (passengers < seats) {

        // if (passengers < seats && passengers < maxPassengersPerFlight) {

        //     passengers += 1;
        //     allPassengers += 1;
        // }
        // else
        //     handleTooMany();

        if (hasSeating())
            passengers += 1;
    }

    /**
     * Add a passenger and update number of checked bags.
     * @param bags
     */
    public void add1Passenger(int bags) {
        if (hasSeating()) {
            add1Passenger();
            totalCheckedBags += bags;
        }
    }

    /**
     * 
     * @param p
     */
    public void add1Passenger(Passenger p) {
        add1Passenger(p.getCheckedBags());
    }

    /**
     * 
     * @param bags
     * @param carryOns
     */
    public void add1Passenger(int bags, int carryOns) {
        if (carryOns <= 2)
            add1Passenger(bags);
    }

    /**
     * 
     * @param p
     * @param carryOns
     */
    public void add1Passenger(Passenger p, int carryOns) {
        add1Passenger(p.getCheckedBags(), carryOns);
    }

    /**
     * Check if flight has an open seat.
     * @return
     */
    private boolean hasSeating() {
        return passengers < seats;
    }

    /**
     * 
     */
    private void handleTooMany() {
        System.out.println("handleTooMany <<< too many passengers!");
    }

    /**
     * Check if this flight has room to combine the 
     * passemgers from a different flight.
     * @param f2
     * @return
     */
    public boolean hasRoom(Flight flight2) {
		int total = this.passengers + flight2.passengers;
		return total <= seats;
	}

    /**
     * 
     * @return
     */
    public int getSeats() {
        return seats;
    }

    /**
     * 
     * @param seats
     */
    public void setSeats(int seats) {
        this.seats = seats;
    }

    /**
     * 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("flightNumber: " + this.flightNumber);
        sb.append(" passengers: " + this.passengers);
        sb.append(" seats: " + this.seats);

        sb.append(" isSeatAvailable: ");
        for (int i = 0; i < this.isSeatAvailable.length; i++) {
            if (i != 0 && i % 10 == 0) sb.append(' ');
            sb.append(this.isSeatAvailable[i] ? 't' : 'f');

        }

        // **** allPassengers is a static field ****
        sb.append(" allPassengers: " + allPassengers);

        return sb.toString();
    }

    /**
     * Swap flights.
     * @param i
     * @param j
     */
    static void swapFlight(Flight i, Flight j) {

        // **** ****
        System.out.println("swapFlight <<< BEFORE i: " + i.toString());
        System.out.println("swapFlight <<< BEFORE j: " + j.toString());

        // **** ****
        Flight k = i;
        i = j;
        j = k;

        // **** ****
        System.out.println("swapFlight <<<  AFTER i: " + i.toString());
        System.out.println("swapFlight <<<  AFTER j: " + j.toString());
    }

    /**
     * Swap the flight numbers contained in the Flight objects.
     * @param i
     * @param j
     */
    static void swapNumbers(Flight i, Flight j) {
        int k = i.getFlightNumber();
        i.setFlightNumber(j.getFlightNumber());
        j.setFlightNumber(k);
    }
}
