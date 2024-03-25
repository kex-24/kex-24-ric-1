# Animal Clinic Management System

## Deadline
This assignment should be completed before the next class session.

## Instructions
Refer to the [assignments section of the course instructions](https://youruniversity.edu/courses/programming/fall2023/assignments) for details on how to do and submit this task.

## Preparation
- Read Module 2: *Looking Inside Classes* from the provided course literature or online resource provided by your institution.
- Ensure you have access to the specified reading material either via the university's learning platform or directly through the given links.

## Learning Goals
By the end of this exercise, you should be comfortable with:
* Creating classes and objects in Java
* Utilizing instance fields
* Implementing constructors
* Generating getter and setter methods
* Manipulating object attributes using methods
* Writing and understanding the `main` method
* Understanding scope and variable shadowing

## Assignment Overview
In this assignment, you are tasked with creating an animal clinic management system. You will model the various entities involved in the management of a veterinary clinic, starting with the most crucial one: animals.

### Exercise A: Creating the Animal Class

1. **Class Creation:** Start by creating a Java file named `Animal.java`. This file will contain the `Animal` class, which will serve as a template for creating different animals treated at the clinic.

2. **Fields:** Define the following private instance fields within the `Animal` class:
   - `String` species
   - `String` name
   - `int` age
   - `String` condition
   - `boolean` cured

3. **Constructor Method:** Implement a constructor method for the `Animal` class. This method should allow setting initial values for the species, name, age, and condition of the animal upon creation.

4. **Getters and Setters:** Generate getter and setter methods for all instance fields. Ensure adherence to naming conventions (`getXXX` for getters and `setXXX` for setters). This facilitates controlled access and modification of the animal attributes.

### Exercise B: Utilizing Objects

1. **Main Method Initiation:** In the `Animal.java` class, add the `main` method. Within this method, demonstrate:
   - The instantiation of at least three Animal objects with varying attributes.
   - The use of setter methods to alter the condition of an animal.
   - Use the getter methods to retrieve and print out the information of each Animal object to the console.

### Exercise C: Clinic Functionality

1. **Treatment Method:** Add a method within the `Animal` class named `treat`. This method should simulate treating the animal's condition, changing its `cured` status to `true`, and updating its condition. It should also print out a message indicating the animal is undergoing treatment.

2. **Patient Information:** Implement a method `printInfo` that prints all relevant information about the animal, including species, name, age, condition, and whether it's cured. This provides a convenient way to display an animal's status.

### Exercise D: Understanding Scope
Explore the concepts of scope and variable shadowing through examples similar to what's provided in the model task. Attempt to fix the code snippets where variable shadowing prevents the intended behavior.

## Submission Checklist
- Create three `Animal` objects, demonstrating different attributes.
- Use getter and setter methods to manipulate and display the animals' details.
- Implement a `treat` method that alters the `cured` status and condition of an animal.
- Add a `printInfo` method to depict each animal's comprehensive information.
- Review examples provided on scope and variable shadowing. Understand how to rectify issues arising from shadowing.

## Errors or Bugs
Should you encounter any inconsistencies or errors with this assignment, please report them through the course's issue tracker with the title "Exercise: Error - [brief description]". Contributions towards improving the course material are highly appreciated.