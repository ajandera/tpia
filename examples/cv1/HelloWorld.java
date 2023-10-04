/*

public class HelloWorld: This line declares a class named HelloWorld.
In Java, every program must have at least one class, and the class name must match the filename
(in this case, it should be saved in a file named HelloWorld.java).

public static void main(String[] args): This line declares the main method, which is the entry point of a Java application.
It takes an array of strings (args) as its parameter. In this case, we don't use the args parameter, so it remains empty.
System.out.println("Hello, World!");: This line uses the System.out.println method to
print the "Hello, World!" message to the console. println is used to print the message and move the cursor to the next line.
To run this program, you'll need to:

Compile it using the javac command: javac HelloWorld.java.
Run the compiled program using the java command: java HelloWorld.
You should see the output "Hello, World!" displayed in your console.

 */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}