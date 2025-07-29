package com.petbag.model;

/**
 * Pet.java
 * 
 * This class represents a Pet object for the Pet BAG (Pet Boarding and Grooming) application.
 * It contains attributes for pet information and boarding details.
 * 
 * @author [Your Name]
 * @version 1.0
 * @date [Current Date]
 */
public class Pet {
    
    // Private attributes for pet information
    private String petType;        // Type of pet (e.g., "Dog", "Cat")
    private String petName;        // Name of the pet
    private int petAge;           // Age of the pet in years
    private int dogSpaces;        // Number of available dog boarding spaces
    private int catSpaces;        // Number of available cat boarding spaces
    private int daysStay;         // Number of days the pet will stay
    private double amountDue;     // Total amount due for boarding and services
    
    /**
     * Default constructor that initializes all attributes with default values
     */
    public Pet() {
        this.petType = "";
        this.petName = "";
        this.petAge = 0;
        this.dogSpaces = 30;      // Default 30 spaces for dogs
        this.catSpaces = 12;      // Default 12 spaces for cats
        this.daysStay = 0;
        this.amountDue = 0.0;
    }
    
    /**
     * Parameterized constructor that initializes all attributes with provided values
     * 
     * @param petType Type of pet
     * @param petName Name of the pet
     * @param petAge Age of the pet
     * @param dogSpaces Number of available dog spaces
     * @param catSpaces Number of available cat spaces
     * @param daysStay Number of days for stay
     * @param amountDue Total amount due
     */
    public Pet(String petType, String petName, int petAge, int dogSpaces, 
               int catSpaces, int daysStay, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }
    
    // Accessor methods (getters)
    
    /**
     * Gets the type of pet
     * @return pet type
     */
    public String getPetType() {
        return petType;
    }
    
    /**
     * Gets the name of the pet
     * @return pet name
     */
    public String getPetName() {
        return petName;
    }
    
    /**
     * Gets the age of the pet
     * @return pet age
     */
    public int getPetAge() {
        return petAge;
    }
    
    /**
     * Gets the number of available dog spaces
     * @return number of dog spaces
     */
    public int getDogSpaces() {
        return dogSpaces;
    }
    
    /**
     * Gets the number of available cat spaces
     * @return number of cat spaces
     */
    public int getCatSpaces() {
        return catSpaces;
    }
    
    /**
     * Gets the number of days the pet will stay
     * @return days of stay
     */
    public int getDaysStay() {
        return daysStay;
    }
    
    /**
     * Gets the total amount due
     * @return amount due
     */
    public double getAmountDue() {
        return amountDue;
    }
    
    // Mutator methods (setters)
    
    /**
     * Sets the type of pet
     * @param petType the pet type to set
     */
    public void setPetType(String petType) {
        this.petType = petType;
    }
    
    /**
     * Sets the name of the pet
     * @param petName the pet name to set
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }
    
    /**
     * Sets the age of the pet
     * @param petAge the pet age to set
     */
    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }
    
    /**
     * Sets the number of available dog spaces
     * @param dogSpaces the number of dog spaces to set
     */
    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }
    
    /**
     * Sets the number of available cat spaces
     * @param catSpaces the number of cat spaces to set
     */
    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }
    
    /**
     * Sets the number of days the pet will stay
     * @param daysStay the days of stay to set
     */
    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }
    
    /**
     * Sets the total amount due
     * @param amountDue the amount due to set
     */
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
    
    /**
     * Returns a string representation of the Pet object
     * @return string representation of the pet
     */
    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", petName='" + petName + '\'' +
                ", petAge=" + petAge +
                ", dogSpaces=" + dogSpaces +
                ", catSpaces=" + catSpaces +
                ", daysStay=" + daysStay +
                ", amountDue=" + amountDue +
                '}';
    }
} 