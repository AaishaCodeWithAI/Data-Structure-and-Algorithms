//If you feel lost:
//It’s okay to feel lost at the start—this is how learning works. 
//Growth takes time, and every small step matters more than it seems.
//Be patient with yourself, stay curious, and keep moving forward.
//You’ll be surprised how far you go.

// Importing Scanner for user input
import java.util.Scanner;

// Class name should match file name
public class VariablesAndDataTypes {

    // Static variable (shared among all objects)
    static String course = "Java DSA";

    // Instance variable
    int studentId = 101;

    public static void main(String[] args) {

        // ==============================
        // 1. OUTPUT IN JAVA
        // ==============================
        System.out.print("Hello ");
        System.out.println("World!"); // prints in new line
        System.out.print("Next Line Example\n");

        // ==============================
        // 2. VARIABLES (Primitive Types)
        // ==============================
        int age = 20;                 // integer
        float price = 99.5f;          // float (must use 'f')
        double pi = 3.14159;          // double
        char grade = 'A';             // character
        boolean isPassed = true;      // boolean

        System.out.println("\n--- Primitive Data Types ---");
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);

        // ==============================
        // 3. NON-PRIMITIVE TYPES
        // ==============================
        String name = "Aaisha";       // String (object)
        int[] marks = {80, 90, 85};  // Array

        System.out.println("\n--- Non-Primitive Data Types ---");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);

        // ==============================
        // 4. TYPE CASTING
        // ==============================

        // Implicit Casting (int → double)
        int x = 10;
        double y = x;

        // Explicit Casting (double → int)
        double d = 10.5;
        int z = (int) d;

        System.out.println("\n--- Type Casting ---");
        System.out.println("Implicit (int to double): " + y);
        System.out.println("Explicit (double to int): " + z);

        // ==============================
        // 5. CONSTANT (final keyword)
        // ==============================
        final double PI = 3.14;
        System.out.println("\nConstant PI: " + PI);

        // ==============================
        // 6. USER INPUT (Scanner)
        // ==============================
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- User Input ---");

        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();

        System.out.print("Enter your name: ");
        String userName = sc.next();

        System.out.print("Enter your grade: ");
        char userGrade = sc.next().charAt(0);

        System.out.println("\n--- User Data ---");
        System.out.println("Name: " + userName);
        System.out.println("Age: " + userAge);
        System.out.println("Grade: " + userGrade);

        // ==============================
        // 7. USING INSTANCE VARIABLE
        // ==============================
        VariablesAndDataTypes obj = new VariablesAndDataTypes();
        System.out.println("\nStudent ID (Instance Variable): " + obj.studentId);

        // ==============================
        // 8. USING STATIC VARIABLE
        // ==============================
        System.out.println("Course (Static Variable): " + course);

        // Close scanner
        sc.close();
    }
}
