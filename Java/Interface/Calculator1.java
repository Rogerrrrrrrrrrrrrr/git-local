package Interface;

// Define the Calculator interface
interface Calculator {
    void add();  // Abstract method for addition
    void sub();  // Abstract method for subtraction
}

// Implement the Calculator interface in the Casio class
class Casio implements Calculator {
    public void add() {
        int a = 4;
        int b = 2;
        int result = a + b;
        System.out.println("Addition Result: " + result);
    }

    public void sub() {
        System.out.println("Subtraction method in Casio");
    }
}

// Main class (you can give it a different name than Calculator)
public class Calculator1 {
    public static void main(String[] args) {
        // Create an instance of Casio
        Casio casioCalculator = new Casio();

        // Call the add and sub methods
        casioCalculator.add();
        casioCalculator.sub();
    }
}
