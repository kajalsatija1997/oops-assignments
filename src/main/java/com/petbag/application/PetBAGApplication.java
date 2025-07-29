package com.petbag.application;

import java.util.ArrayList;
import java.util.Scanner;
import com.petbag.model.Pet;
import com.petbag.model.Dog;
import com.petbag.model.Cat;

/**
 * PetBAGApplication.java
 * 
 * Main application class for Pet BAG (Pet Boarding and Grooming)
 * Implements the check-in and check-out functionality as specified
 * in the Pet BAG requirements.
 * 
 * @author [Your Name]
 * @version 1.0
 * @date [Current Date]
 */
public class PetBAGApplication {
    
    // Static variables to track available spaces
    private static int availableDogSpaces = 30;
    private static int availableCatSpaces = 12;
    
    // ArrayList to store all pets currently boarded
    private static ArrayList<Pet> boardedPets = new ArrayList<>();
    
    // Scanner for user input
    private static Scanner scanner = new Scanner(System.in);
    
    /**
     * Main method to run the Pet BAG application
     */
    public static void main(String[] args) {
        System.out.println("=== Pet BAG (Pet Boarding and Grooming) Application ===\n");
        
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = getMenuChoice();
            
            switch (choice) {
                case 1:
                    petCheckIn();
                    break;
                case 2:
                    petCheckOut();
                    break;
                case 3:
                    displayBoardingStatus();
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using Pet BAG!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
    
    /**
     * Displays the main menu options
     */
    private static void displayMenu() {
        System.out.println("\n=== Pet BAG Menu ===");
        System.out.println("1. Check-in Pet");
        System.out.println("2. Check-out Pet");
        System.out.println("3. Display Boarding Status");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");
    }
    
    /**
     * Gets the user's menu choice
     * @return menu choice as integer
     */
    private static int getMenuChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextInt();
    }
    
    /**
     * Implements the pet check-in process according to specifications
     */
    private static void petCheckIn() {
        System.out.println("\n=== Pet Check-In Process ===");
        
        // Step 1: Determine pet type and check space availability
        System.out.print("Enter pet type (dog/cat): ");
        scanner.nextLine(); // Clear buffer
        String petType = scanner.nextLine().toLowerCase();
        
        boolean spaceAvailable = false;
        
        if (petType.equals("dog")) {
            if (availableDogSpaces > 0) {
                spaceAvailable = true;
                System.out.println("✓ Dog space available. " + availableDogSpaces + " spaces remaining.");
            } else {
                System.out.println("✗ No dog spaces available.");
            }
        } else if (petType.equals("cat")) {
            if (availableCatSpaces > 0) {
                spaceAvailable = true;
                System.out.println("✓ Cat space available. " + availableCatSpaces + " spaces remaining.");
            } else {
                System.out.println("✗ No cat spaces available.");
            }
        } else {
            System.out.println("Invalid pet type. Please enter 'dog' or 'cat'.");
            return;
        }
        
        if (!spaceAvailable) {
            return;
        }
        
        // Step 2: Collect pet information
        System.out.print("Enter pet name: ");
        String petName = scanner.nextLine();
        
        System.out.print("Enter pet age: ");
        int petAge = scanner.nextInt();
        
        System.out.print("Enter length of stay (days): ");
        int daysStay = scanner.nextInt();
        
        // Step 3: Check if returning pet
        System.out.print("Is this a returning pet? (yes/no): ");
        scanner.nextLine(); // Clear buffer
        String returningPet = scanner.nextLine().toLowerCase();
        
        if (returningPet.equals("yes")) {
            System.out.println("Updating information for returning pet: " + petName);
            // In a real application, you would search for existing pet and update info
        }
        
        // Step 4: Handle grooming for dogs
        boolean groomingRequested = false;
        if (petType.equals("dog") && daysStay >= 2) {
            System.out.print("Would you like grooming service? (yes/no): ");
            String groomingChoice = scanner.nextLine().toLowerCase();
            groomingRequested = groomingChoice.equals("yes");
        }
        
        // Step 5: Assign space and create pet object
        if (petType.equals("dog")) {
            double dogWeight = 0.0;
            if (groomingRequested) {
                System.out.print("Enter dog weight (lbs): ");
                dogWeight = scanner.nextDouble();
            }
            
            // Assign space number (in real app, would find next available space)
            int spaceNumber = 30 - availableDogSpaces + 1;
            
            Dog dog = new Dog(petName, petAge, daysStay, 0.0, spaceNumber, dogWeight, groomingRequested);
            boardedPets.add(dog);
            availableDogSpaces--;
            
            System.out.println("✓ Dog " + petName + " assigned to space " + spaceNumber);
            
        } else if (petType.equals("cat")) {
            // Assign space number (in real app, would find next available space)
            int spaceNumber = 12 - availableCatSpaces + 1;
            
            Cat cat = new Cat(petName, petAge, daysStay, 0.0, spaceNumber);
            boardedPets.add(cat);
            availableCatSpaces--;
            
            System.out.println("✓ Cat " + petName + " assigned to space " + spaceNumber);
        }
        
        System.out.println("✓ Pet check-in completed successfully!");
    }
    
    /**
     * Implements the pet check-out process according to specifications
     */
    private static void petCheckOut() {
        System.out.println("\n=== Pet Check-Out Process ===");
        
        if (boardedPets.isEmpty()) {
            System.out.println("No pets currently boarded.");
            return;
        }
        
        // Step 1: Identify the pet
        System.out.println("Currently boarded pets:");
        for (int i = 0; i < boardedPets.size(); i++) {
            Pet pet = boardedPets.get(i);
            System.out.println((i + 1) + ". " + pet.getPetName() + " (" + pet.getPetType() + ")");
        }
        
        System.out.print("Enter the number of the pet to check out: ");
        int petIndex = scanner.nextInt() - 1;
        
        if (petIndex < 0 || petIndex >= boardedPets.size()) {
            System.out.println("Invalid pet selection.");
            return;
        }
        
        Pet petToCheckOut = boardedPets.get(petIndex);
        
        // Step 2: Calculate fees
        double totalFee = 0.0;
        double boardingFee = 0.0;
        double groomingFee = 0.0;
        
        if (petToCheckOut instanceof Dog) {
            Dog dog = (Dog) petToCheckOut;
            boardingFee = dog.calculateBoardingFee() * dog.getDaysStay();
            groomingFee = dog.calculateGroomingFee();
            totalFee = boardingFee + groomingFee;
            
            System.out.println("Pet: " + dog.getPetName() + " (Dog)");
            System.out.println("Weight: " + dog.getDogWeight() + " lbs");
            System.out.println("Space: " + dog.getDogSpaceNumber());
            System.out.println("Days: " + dog.getDaysStay());
            System.out.println("Boarding Fee: $" + String.format("%.2f", boardingFee));
            if (dog.getGrooming()) {
                System.out.println("Grooming Fee: $" + String.format("%.2f", groomingFee));
            }
            
        } else if (petToCheckOut instanceof Cat) {
            Cat cat = (Cat) petToCheckOut;
            boardingFee = cat.calculateBoardingFee() * cat.getDaysStay();
            totalFee = boardingFee;
            
            System.out.println("Pet: " + cat.getPetName() + " (Cat)");
            System.out.println("Space: " + cat.getCatSpaceNumber());
            System.out.println("Days: " + cat.getDaysStay());
            System.out.println("Boarding Fee: $" + String.format("%.2f", boardingFee));
        }
        
        System.out.println("Total Fee: $" + String.format("%.2f", totalFee));
        
        // Step 3: Mark space as vacant
        if (petToCheckOut instanceof Dog) {
            availableDogSpaces++;
            System.out.println("✓ Dog space marked as vacant");
        } else if (petToCheckOut instanceof Cat) {
            availableCatSpaces++;
            System.out.println("✓ Cat space marked as vacant");
        }
        
        // Remove pet from boarded list
        boardedPets.remove(petIndex);
        
        System.out.println("✓ Pet check-out completed successfully!");
    }
    
    /**
     * Displays current boarding status
     */
    private static void displayBoardingStatus() {
        System.out.println("\n=== Boarding Status ===");
        System.out.println("Available Dog Spaces: " + availableDogSpaces + "/30");
        System.out.println("Available Cat Spaces: " + availableCatSpaces + "/12");
        System.out.println("Currently Boarded Pets: " + boardedPets.size());
        
        if (!boardedPets.isEmpty()) {
            System.out.println("\nBoarded Pets:");
            for (Pet pet : boardedPets) {
                if (pet instanceof Dog) {
                    Dog dog = (Dog) pet;
                    System.out.println("- " + dog.getPetName() + " (Dog) - Space " + dog.getDogSpaceNumber());
                } else if (pet instanceof Cat) {
                    Cat cat = (Cat) pet;
                    System.out.println("- " + cat.getPetName() + " (Cat) - Space " + cat.getCatSpaceNumber());
                }
            }
        }
    }
} 