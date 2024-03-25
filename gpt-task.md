# Personalized Programming Task: The Coffee Shop Simulation

### Deadline
This assignment should be completed and submitted before the next class session.

### Instructions
Review the course instructions for details on how to complete and submit this assignment.

### Preparation
- Engage with all materials in Module 2: Looking Inside Classes 
- Access the course materials either via the provided link on your course platform or directly through the provided URL.

### Learning Goals
The goals for this week include:
* Understanding Java classes
* Implementing instance fields
* Crafting a constructor method
* Developing getters and setters
* Utilizing the dot operator
* Outputting to the terminal
* Implementing the `main` method
* Understanding scope and variable shadowing

### Troubleshooting Guide
Should you encounter any issues:
1. Cross-check with posted questions on the course's issues section.
2. If your question hasn't been asked yet, post it as a new issue.
3. Seek assistance during the weekly lab session. Check your schedule for the exact time.

We encourage you to collaborate with peers but remember to not share your solutions directly.

### Assignment: The Coffee Shop Simulation

Welcome to the Java Coffee Shop! Your task is to model a coffee ordering system in Java. Imagine a cozy coffee shop where customers can order their favorite brews, featuring a variety of coffees with different strengths, milk types, sizes, and extra shots.

#### Exercise 0: Setting the Scene

Create a new Java file named `Coffee.java` in the `src` directory. This file will define the `Coffee` class.

Introduce the concept of a coffee order with basic attributes:

- `String` type (e.g., "Espresso", "Latte")
- `String` size (e.g., "small", "medium", "large")
- `boolean` extraShot (true if an extra shot of espresso is added)
- `boolean` milk (true if milk is added)
- `String` milkType (e.g., "regular", "soy", "almond")

#### Exercise 1: Expanding the Menu
Now that we've introduced the basic coffee, let's expand our offerings. Create two more coffee objects, bringing our total offerings to three distinct coffees. Print each coffee's details to the console.

#### Exercise 2: Encapsulating Coffee
Let's encapsulate our Coffee objects by defining the following fields within the Coffee class, applying the `private` access modifier to each:

- `String` type
- `String` size
- `boolean` extraShot
- `boolean` milk
- `String` milkType

Create a constructor and accompanying getters and setters for each field.

#### Exercise 3: Ordering a Coffee
Implement a constructor for the Coffee class that permits setting all attributes during object creation. Replace direct field manipulation with constructor utilization and check that everything compiles.

#### Exercise 4: Printing Coffee Details
Introduce a method named `printOrderDetails()` that outputs all details of the coffee order to the console.

#### Exercise 5: Special Requests
Embed functionality allowing a customer to request adjustments to their coffee order after it's been created. Implement methods to modify the coffee's size, add an extra shot, or change the milk type. Ensure each method only modifies the relevant attribute and then updates the order details.

#### Exercise 6: Understanding Scope
Examine examples of variable shadowing within the context of your Coffee class. Think about the implications for your getters and setters as well as within your constructor.

### Checklist
- Create the Coffee class with the specified fields and privacy modifiers.
- Implement a constructor, getters, and setters for the class.
- Utilize the constructor to instantiate coffee objects.
- Devise a method to print coffee order details.
- Integrate functionality permitting order adjustments.
- Explore and understand variable shadowing within the class.

### Bugs and Errors?
Should you find any errors or issues with this task, please report them by creating a new issue with a title indicative of the task and a brief summary of the problem encountered.