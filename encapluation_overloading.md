In Java, encapsulation and overloading are two important concepts in object-oriented programming. Let's explain each concept and provide examples for better understanding.

1. Encapsulation:
   Encapsulation is one of the four fundamental OOP concepts, the others being inheritance, polymorphism, and abstraction. It involves bundling an object's state (attributes) and behavior (methods) into a single unit, known as a class. Access to the object's internal data is controlled through public methods, which are known as getters and setters. Encapsulation helps in data hiding and maintaining the integrity of an object's state, as it restricts direct access to the object's data.

   Example of encapsulation in Java:

```java
public class Student {
    private String name; // private attribute

    public String getName() { // getter method
        return name;
    }

    public void setName(String name) { // setter method
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        System.out.println("Student's name: " + student.getName());
    }
}
```

In this example, the `name` attribute of the `Student` class is declared as private, and access to it is controlled through getter and setter methods. This encapsulates the `name` attribute, providing a controlled way to access and modify it.

2. Overloading:
   Method overloading is a concept where multiple methods in the same class can have the same name but different parameter lists. This allows you to provide multiple ways of calling a method, based on the number or type of arguments passed to it. The method chosen at runtime depends on the arguments provided, and this is known as "method overloading."

   Example of method overloading in Java:

```java
public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        System.out.println("Sum of two integers: " + math.add(5, 3));
        System.out.println("Sum of two doubles: " + math.add(2.5, 3.7));
    }
}
```

In this example, the `MathOperations` class has two `add` methods, one for adding two integers and another for adding two doubles. The methods have the same name but different parameter types (integers and doubles), allowing you to use the same method name for different data types, which is method overloading.

Encapsulation and method overloading are essential concepts in Java that help improve code organization, security, and usability by controlling data access and providing flexibility in method usage.