package com.petbag.demo;

import com.petbag.model.Pet;
import com.petbag.model.Dog;
import com.petbag.model.Cat;

/**
 * PetBAGDemo.java
 * 
 * This demonstration program shows how the Pet, Dog, and Cat classes
 * work together in the Pet BAG application.
 * 
 * @author [Your Name]
 * @version 1.0
 * @date [Current Date]
 */
public class PetBAGDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Pet BAG (Pet Boarding and Grooming) Demo ===\n");
        
        // Create a dog with grooming service
        Dog dog1 = new Dog("Buddy", 5, 3, 0.0, 1, 35.5, true);
        System.out.println("Dog Check-in:");
        System.out.println("Name: " + dog1.getPetName());
        System.out.println("Age: " + dog1.getPetAge() + " years");
        System.out.println("Weight: " + dog1.getDogWeight() + " lbs");
        System.out.println("Space Number: " + dog1.getDogSpaceNumber());
        System.out.println("Days Stay: " + dog1.getDaysStay());
        System.out.println("Grooming Requested: " + dog1.getGrooming());
        System.out.println("Daily Boarding Fee: $" + dog1.calculateBoardingFee());
        System.out.println("Grooming Fee: $" + dog1.calculateGroomingFee());
        System.out.println();
        
        // Create a cat
        Cat cat1 = new Cat("Whiskers", 3, 2, 0.0, 1);
        System.out.println("Cat Check-in:");
        System.out.println("Name: " + cat1.getPetName());
        System.out.println("Age: " + cat1.getPetAge() + " years");
        System.out.println("Space Number: " + cat1.getCatSpaceNumber());
        System.out.println("Days Stay: " + cat1.getDaysStay());
        System.out.println("Daily Boarding Fee: $" + cat1.calculateBoardingFee());
        System.out.println();
        
        // Demonstrate inheritance
        System.out.println("=== Inheritance Demo ===");
        Pet[] pets = new Pet[2];
        pets[0] = dog1;  // Dog is a Pet
        pets[1] = cat1;  // Cat is a Pet
        
        for (int i = 0; i < pets.length; i++) {
            System.out.println("Pet " + (i+1) + ": " + pets[i].getPetName() + 
                             " (" + pets[i].getPetType() + ")");
        }
        System.out.println();
        
        // Demonstrate polymorphism
        System.out.println("=== Polymorphism Demo ===");
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                Dog dog = (Dog) pet;
                System.out.println(dog.getPetName() + " is a dog with weight: " + 
                                 dog.getDogWeight() + " lbs");
            } else if (pet instanceof Cat) {
                Cat cat = (Cat) pet;
                System.out.println(cat.getPetName() + " is a cat in space: " + 
                                 cat.getCatSpaceNumber());
            }
        }
        
        System.out.println("\n=== Demo Complete ===");
    }
} 