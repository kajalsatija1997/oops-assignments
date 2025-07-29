package com.petbag.model;

/**
 * Dog.java
 * 
 * This class represents a Dog object that extends the Pet class.
 * It contains additional attributes specific to dogs including space number,
 * weight, and grooming status.
 * 
 * @author [Your Name]
 * @version 1.0
 * @date [Current Date]
 */
public class Dog extends Pet {
    
    // Private attributes specific to dogs
    private int dogSpaceNumber;    // Assigned boarding space number for the dog
    private double dogWeight;      // Weight of the dog in pounds
    private boolean grooming;      // Whether grooming service is requested
    
    /**
     * Default constructor for Dog class
     */
    public Dog() {
        super();  // Call parent class constructor
        this.dogSpaceNumber = 0;
        this.dogWeight = 0.0;
        this.grooming = false;
    }
    
    /**
     * Parameterized constructor for Dog class
     * 
     * @param petName Name of the dog
     * @param petAge Age of the dog
     * @param daysStay Number of days for stay
     * @param amountDue Total amount due
     * @param dogSpaceNumber Assigned space number
     * @param dogWeight Weight of the dog
     * @param grooming Whether grooming is requested
     */
    public Dog(String petName, int petAge, int daysStay, double amountDue,
               int dogSpaceNumber, double dogWeight, boolean grooming) {
        super("Dog", petName, petAge, 30, 12, daysStay, amountDue);  // Call parent constructor
        this.dogSpaceNumber = dogSpaceNumber;
        this.dogWeight = dogWeight;
        this.grooming = grooming;
    }
    
    // Accessor methods (getters)
    
    /**
     * Gets the dog's assigned space number
     * @return dog space number
     */
    public int getDogSpaceNumber() {
        return dogSpaceNumber;
    }
    
    /**
     * Gets the dog's weight
     * @return dog weight in pounds
     */
    public double getDogWeight() {
        return dogWeight;
    }
    
    /**
     * Gets whether grooming service is requested
     * @return true if grooming is requested, false otherwise
     */
    public boolean getGrooming() {
        return grooming;
    }
    
    // Mutator methods (setters)
    
    /**
     * Sets the dog's assigned space number
     * @param dogSpaceNumber the space number to set
     */
    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;
    }
    
    /**
     * Sets the dog's weight
     * @param dogWeight the weight to set in pounds
     */
    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }
    
    /**
     * Sets whether grooming service is requested
     * @param grooming true if grooming is requested, false otherwise
     */
    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }
    
    /**
     * Calculates boarding fee based on dog weight
     * @return daily boarding fee
     */
    public double calculateBoardingFee() {
        if (dogWeight >= 30) {
            return 34.00;  // Dogs 30+ lbs
        } else if (dogWeight >= 20) {
            return 29.00;  // Dogs 20-30 lbs
        } else {
            return 24.00;  // Dogs under 20 lbs
        }
    }
    
    /**
     * Calculates grooming fee based on dog weight
     * @return grooming fee
     */
    public double calculateGroomingFee() {
        if (grooming) {
            if (dogWeight >= 30) {
                return 29.95;  // Dogs 30+ lbs
            } else if (dogWeight >= 20) {
                return 24.95;  // Dogs 20-30 lbs
            } else {
                return 19.95;  // Dogs under 20 lbs
            }
        }
        return 0.0;  // No grooming requested
    }
    
    /**
     * Returns a string representation of the Dog object
     * @return string representation of the dog
     */
    @Override
    public String toString() {
        return "Dog{" +
                "petName='" + getPetName() + '\'' +
                ", petAge=" + getPetAge() +
                ", daysStay=" + getDaysStay() +
                ", amountDue=" + getAmountDue() +
                ", dogSpaceNumber=" + dogSpaceNumber +
                ", dogWeight=" + dogWeight +
                ", grooming=" + grooming +
                '}';
    }
} 