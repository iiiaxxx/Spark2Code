import java.util.Scanner;                       // For reading user input
import java.util.InputMismatchException;        // For catching input errors

public class CalculaterProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner to read input
        boolean running = true;                    // Controls the loop

        while (running) {
            displayMenu();                         // Show all calculator options
            System.out.print("Choose an option: ");
            int choice = -1;

            try {
                choice = scanner.nextInt();        // Read user's menu choice
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();                    // Clear invalid input
                continue;
            }

            // Handle user choice
            switch (choice) {
                case 1: performAddition(scanner); break;
                case 2: performSubtraction(scanner); break;
                case 3: performMultiplication(scanner); break;
                case 4: performDivision(scanner); break;
                case 5: performSquareRoot(scanner); break;
                case 6: performPower(scanner); break;
                case 7: performSine(scanner); break;
                case 8: performCosine(scanner); break;
                case 9: performTangent(scanner); break;
                case 10: performNaturalLog(scanner); break;
                case 11: performLogBase10(scanner); break;
                case 12: performAbsoluteValue(scanner); break;
                case 13: performRound(scanner); break;
                case 14: performCeiling(scanner); break;
                case 15: performFloor(scanner); break;
                case 16: performMin(scanner); break;
                case 17: performMax(scanner); break;
                case 0:
                    running = false;
                    System.out.println("Exiting Calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close(); // Always close scanner at end
    }

    // Displays the menu options
    public static void displayMenu() {
        System.out.println("\n---- Scientific Calculator Menu ----");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square Root");
        System.out.println("6. Power (x^y)");
        System.out.println("7. Sine");
        System.out.println("8. Cosine");
        System.out.println("9. Tangent");
        System.out.println("10. Natural Logarithm");
        System.out.println("11. Logarithm Base 10");
        System.out.println("12. Absolute Value");
        System.out.println("13. Round");
        System.out.println("14. Ceiling");
        System.out.println("15. Floor");
        System.out.println("16. Minimum of Two Numbers");
        System.out.println("17. Maximum of Two Numbers");
        System.out.println("0. Exit");
    }

    // --- Math Logic Methods ---

    public static double add(double a, double b) { return a + b; }

    public static double subtract(double a, double b) { return a - b; }

    public static double multiply(double a, double b) { return a * b; }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static double calculateSquareRoot(double num) {
        if (num < 0) {
            System.out.println("Cannot calculate square root of negative number.");
            return Double.NaN;
        }
        return Math.sqrt(num);
    }

    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double calculateSine(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    public static double calculateCosine(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

    public static double calculateTangent(double degrees) {
        double radians = Math.toRadians(degrees);
        if (Math.abs(Math.cos(radians)) < 1e-10) {
            System.out.println("Tangent undefined at this angle.");
            return Double.NaN;
        }
        return Math.tan(radians);
    }

    public static double calculateNaturalLogarithm(double num) {
        if (num <= 0) {
            System.out.println("Natural log undefined for non-positive numbers.");
            return Double.NaN;
        }
        return Math.log(num);
    }

    public static double calculateLogarithmBase10(double num) {
        if (num <= 0) {
            System.out.println("Log base 10 undefined for non-positive numbers.");
            return Double.NaN;
        }
        return Math.log10(num);
    }

    public static double calculateAbsoluteValue(double num) {
        return Math.abs(num);
    }

    public static long roundNumber(double num) {
        return Math.round(num);
    }

    public static double ceilingNumber(double num) {
        return Math.ceil(num);
    }

    public static double floorNumber(double num) {
        return Math.floor(num);
    }

    public static double findMin(double a, double b) {
        return Math.min(a, b);
    }

    public static double findMax(double a, double b) {
        return Math.max(a, b);
    }

    // --- Helper Methods to read input and call logic methods ---

    private static void performAddition(Scanner s) {
        System.out.print("Enter two numbers: ");
        System.out.println("Result: " + add(s.nextDouble(), s.nextDouble()));
    }

    private static void performSubtraction(Scanner s) {
        System.out.print("Enter two numbers: ");
        System.out.println("Result: " + subtract(s.nextDouble(), s.nextDouble()));
    }

    private static void performMultiplication(Scanner s) {
        System.out.print("Enter two numbers: ");
        System.out.println("Result: " + multiply(s.nextDouble(), s.nextDouble()));
    }

    private static void performDivision(Scanner s) {
        System.out.print("Enter two numbers: ");
        System.out.println("Result: " + divide(s.nextDouble(), s.nextDouble()));
    }

    private static void performSquareRoot(Scanner s) {
        System.out.print("Enter a number: ");
        System.out.println("Result: " + calculateSquareRoot(s.nextDouble()));
    }

    private static void performPower(Scanner s) {
        System.out.print("Enter base and exponent: ");
        System.out.println("Result: " + calculatePower(s.nextDouble(), s.nextDouble()));
    }

    private static void performSine(Scanner s) {
        System.out.print("Enter angle in degrees: ");
        System.out.println("Result: " + calculateSine(s.nextDouble()));
    }

    private static void performCosine(Scanner s) {
        System.out.print("Enter angle in degrees: ");
        System.out.println("Result: " + calculateCosine(s.nextDouble()));
    }

    private static void performTangent(Scanner s) {
        System.out.print("Enter angle in degrees: ");
        System.out.println("Result: " + calculateTangent(s.nextDouble()));
    }

    private static void performNaturalLog(Scanner s) {
        System.out.print("Enter a number: ");
        System.out.println("Result: " + calculateNaturalLogarithm(s.nextDouble()));
    }

    private static void performLogBase10(Scanner s) {
        System.out.print("Enter a number: ");
        System.out.println("Result: " + calculateLogarithmBase10(s.nextDouble()));
    }

    private static void performAbsoluteValue(Scanner s) {
        System.out.print("Enter a number: ");
        System.out.println("Result: " + calculateAbsoluteValue(s.nextDouble()));
    }

    private static void performRound(Scanner s) {
        System.out.print("Enter a number: ");
        System.out.println("Result: " + roundNumber(s.nextDouble()));
    }

    private static void performCeiling(Scanner s) {
        System.out.print("Enter a number: ");
        System.out.println("Result: " + ceilingNumber(s.nextDouble()));
    }

    private static void performFloor(Scanner s) {
        System.out.print("Enter a number: ");
        System.out.println("Result: " + floorNumber(s.nextDouble()));
    }

    private static void performMin(Scanner s) {
        System.out.print("Enter two numbers: ");
        System.out.println("Result: " + findMin(s.nextDouble(), s.nextDouble()));
    }

    private static void performMax(Scanner s) {
        System.out.print("Enter two numbers: ");
        System.out.println("Result: " + findMax(s.nextDouble(), s.nextDouble()));
    }
}
