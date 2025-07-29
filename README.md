# IT 145 Project One - Pet BAG Assignment

## Overview
This project demonstrates object-oriented programming principles by creating a Pet class for the Pet BAG (Pet Boarding and Grooming) application. The assignment includes a Java class implementation, pseudocode, flowchart, and explanation of OOP principles.

## Project Structure
```
Danny-Assignement1/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── petbag/
│                   ├── model/          # Data model classes
│                   │   ├── Pet.java
│                   │   ├── Dog.java
│                   │   └── Cat.java
│                   ├── application/     # Main application
│                   │   └── PetBAGApplication.java
│                   └── demo/           # Demonstration programs
│                       └── PetBAGDemo.java
├── docs/                              # Documentation
│   └── Global_Rain_Summary_Report.md
├── bin/                               # Compiled classes (created by build)
├── build.sh                           # Build script
└── README.md                          # This file
```

## Files Included

### 1. Pet.java
- **Purpose**: Main Java class implementing the Pet object based on the UML class diagram
- **Features**:
  - All required attributes with appropriate data types
  - Default and parameterized constructors
  - Complete set of accessor and mutator methods
  - Comprehensive documentation with JavaDoc comments
  - toString() method for object representation

### 2. Dog.java
- **Purpose**: Dog class that extends Pet with dog-specific attributes
- **Features**:
  - Inherits from Pet class
  - Additional attributes: dogSpaceNumber, dogWeight, grooming
  - Fee calculation methods based on weight categories
  - Grooming service support for dogs staying 2+ days

### 3. Cat.java
- **Purpose**: Cat class that extends Pet with cat-specific attributes
- **Features**:
  - Inherits from Pet class
  - Additional attribute: catSpaceNumber
  - Flat rate boarding fee calculation ($18.00)
  - No grooming service (as per requirements)

### 4. PetBAGApplication.java
- **Purpose**: Main application implementing check-in and check-out functionality
- **Features**:
  - Interactive menu system
  - Pet check-in process with space availability checking
  - Pet check-out process with fee calculation
  - Boarding status display
  - Complete business logic implementation

### 5. PetBAGDemo.java
- **Purpose**: Demonstration program showing class relationships
- **Features**:
  - Shows inheritance and polymorphism
  - Demonstrates fee calculations
  - Example usage of all classes

### 6. Global_Rain_Summary_Report.md
- **Purpose**: Summary report containing pseudocode, flowchart, and OOP principles explanation
- **Contents**:
  - Pseudocode for pet check-in process
  - Flowchart representation of the check-in logic
  - Explanation of applied OOP principles (Encapsulation, Inheritance, Abstraction, Polymorphism)
  - Additional implementation notes

## Assignment Requirements Met

### Pet.java Class Requirements:
✅ **All attributes with appropriate data structures**
- petType (String)
- petName (String) 
- petAge (int)
- dogSpaces (int)
- catSpaces (int)
- daysStay (int)
- amountDue (double)

✅ **Constructor methods**
- Default constructor with initialization
- Parameterized constructor for all attributes

✅ **Accessors and mutators for all attributes**
- Complete getter and setter methods for all attributes

✅ **Proper commenting and documentation**
- JavaDoc comments for all methods
- Inline comments explaining functionality

### Summary Report Requirements:
✅ **Pseudocode for pet check-in process**
- Logical step-by-step algorithm
- Handles space availability checking
- Includes grooming service logic for dogs
- Manages returning pet scenarios

✅ **Flowchart representation**
- Clear start and end points
- Appropriate decision branching
- Aligned with check-in process specifications

✅ **OOP principles explanation**
- Detailed explanation of Encapsulation, Inheritance, Abstraction, and Polymorphism
- Shows how principles are applied in the Pet class design

## How to Use

### For Assignment Submission:
1. **Compile and Test Pet.java**:
   ```bash
   javac Pet.java
   ```

2. **Review the Summary Report**:
   - Open `Global_Rain_Summary_Report.md` to view the complete analysis
   - The pseudocode shows the logical flow for pet check-in
   - The flowchart provides visual representation of the process
   - OOP principles are explained with specific examples

### For Complete Application Testing:
1. **Use the build script** (recommended):
   ```bash
   ./build.sh
   ```

2. **Manual compilation**:
   ```bash
   # Create bin directory
   mkdir -p bin
   
   # Compile model classes
   javac -d bin src/main/java/com/petbag/model/*.java
   
   # Compile application classes
   javac -cp bin -d bin src/main/java/com/petbag/application/*.java
   
   # Compile demo classes
   javac -cp bin -d bin src/main/java/com/petbag/demo/*.java
   
   # Run main application
   java -cp bin com.petbag.application.PetBAGApplication
   
   # Run demo
   java -cp bin com.petbag.demo.PetBAGDemo
   ```

### Application Features:
- **Interactive Menu**: Choose check-in, check-out, or view status
- **Space Management**: Tracks available dog (30) and cat (12) spaces
- **Fee Calculation**: Automatic calculation based on pet type and weight
- **Grooming Service**: Available for dogs staying 2+ days
- **Returning Pets**: Support for updating existing pet information

## Key Features

- **Encapsulation**: Private attributes with public access methods
- **Inheritance Ready**: Designed to be parent class for Dog and Cat
- **Flexible Constructors**: Multiple initialization options
- **Comprehensive Documentation**: Clear comments and JavaDoc
- **Type Safety**: Appropriate data types for all attributes
- **Extensible Design**: Easy to add new pet types or features

## Business Logic Implemented

The Pet class supports the Pet BAG business requirements:
- **Space Management**: Tracks available dog (30) and cat (12) spaces
- **Fee Calculation**: Supports boarding and grooming fee structures
- **Pet Information**: Stores all necessary pet details
- **Stay Duration**: Tracks length of boarding stay
- **Service Options**: Supports grooming service for dogs staying 2+ days

This implementation provides a solid foundation for the complete Pet BAG application while demonstrating mastery of object-oriented programming principles. 