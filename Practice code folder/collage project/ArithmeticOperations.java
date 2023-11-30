public class ArithmeticOperations {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Addition
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Subtraction
        int difference = num1 - num2;
        System.out.println("The difference of " + num1 + " and " + num2 + " is: " + difference);

        // Multiplication
        int product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        // Division
        int quotient = num1 / num2;
        System.out.println("The quotient of " + num1 + " and " + num2 + " is: " + quotient);

        // Modulus
        int remainder = num1 % num2;
        System.out.println("The remainder of " + num1 + " divided by " + num2 + " is: " + remainder);
    }
}