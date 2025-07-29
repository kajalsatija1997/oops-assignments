package com.petbag.model;

/**
 * Cat.java
 * 
 * This class represents a Cat object that extends the Pet class.
 * It contains additional attributes specific to cats including space number.
 * 
 * @author [Your Name]
 * @version 1.0
 * @date [Current Date]
 */
public class Cat extends Pet {
    
    // Private attributes specific to cats
    private int catSpaceNumber;    // Assigned boarding space number for the cat
    
    /**
     * Default constructor for Cat class
     */
    public Cat() {
        super();  // Call parent class constructor
        this.catSpaceNumber = 0;
    }
    
    /**
     * Parameterized constructor for Cat class
     * 
     * @param petName Name of the cat
     * @param petAge Age of the cat
     * @param daysStay Number of days for stay
     * @param amountDue Total amount due
     * @param catSpaceNumber Assigned space number
     */
    public Cat(String petName, int petAge, int daysStay, double amountDue, int catSpaceNumber) {
        super("Cat", petName, petAge, 30, 12, daysStay, amountDue);  // Call parent constructor
        this.catSpaceNumber = catSpaceNumber;
    }
    
    // Accessor methods (getters)
    
    /**
     * Gets the cat's assigned space number
     * @return cat space number
     */
    public int getCatSpaceNumber() {
        return catSpaceNumber;
    }
    
    // Mutator methods (setters)
    
    /**
     * Sets the cat's assigned space number
     * @param catSpaceNumber the space number to set
     */
    public void setCatSpaceNumber(int catSpaceNumber) {
        this.catSpaceNumber = catSpaceNumber;
    }
    
    /**
     * Calculates boarding fee for cats (flat rate)
     * @return daily boarding fee ($18.00 for all cats)
     */
    public double calculateBoardingFee() {
        return 18.00;  // Flat rate for all cats
    }
    
    /**
     * Returns a string representation of the Cat object
     * @return string representation of the cat
     */
    @Override
    public String toString() {
        return "Cat{" +
                "petName='" + getPetName() + '\'' +
                ", petAge=" + getPetAge() +
                ", daysStay=" + getDaysStay() +
                ", amountDue=" + getAmountDue() +
                ", catSpaceNumber=" + catSpaceNumber +
                '}';
    }
} 