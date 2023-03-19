package com.canessa.calcengine;

public class Passenger {
    
    private int checkedBags;
    private int freeBags;
    private double perBagFee;

    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }

    public void setFreeBags(int freeBags) {
        this.freeBags = freeBags;
    }

    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }

    public int getCheckedBags() {
        return this.checkedBags;
    }

    public int getFreeBags() {
        return this.freeBags;
    }

    public double getPerBagFee() {
        return this.perBagFee;
    }

    /**
     * Default constructor (no parameters)
     */
    public Passenger() { }

    /**
     * Constructor
     * @param freeBags
     */
    public Passenger(int freeBags) {
        this(freeBags > 1 ? 25.0d : 50.0d);
        this.freeBags = freeBags;
    }

    /**
     * Constructor
     * @param freeBags
     * @param checkedBags
     */
    public Passenger(int freeBags, int checkedBags) {

        // **** first call existing constructor ****
        // this.freeBags = freeBags;
        this(freeBags);

        // **** continue setting other fields ****
        this.checkedBags = checkedBags;
    }

    
    /**
     * Constructor
     * Part of the business logic.
     * @param perBagFee
     */
    //public Passenger(double perBagFee) {
    private Passenger(double perBagFee) {
        this.perBagFee = perBagFee;
    }


    /**
     * 
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("checkedBags: " + this.checkedBags);
        sb.append(" freeBags: " + this.freeBags);
        sb.append(" perBagFee: " + this.perBagFee);
        return sb.toString();
    }
}
