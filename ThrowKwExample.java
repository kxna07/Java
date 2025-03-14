public class ThrowKwExample {
    
    /*
    // Method to perform division
    // This method takes two integers as input and returns their division result.
    // If the denominator (b) is zero, it throws an ArithmeticException.
    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero..."); // Throwing an exception if division by zero
        } else {
            int ans = a / b; // Performing division
            System.out.println(ans); // Printing the result
        }
    }
    */

    public static void main(String[] args) {
        // Taking input from command-line arguments and converting them to integers
        //divide(10,0);
        int a = Integer.parseInt(args[0]); // First argument as numerator
        int b = Integer.parseInt(args[1]); // Second argument as denominator
        int ans = 0; // Variable to store division result

        // Checking if the denominator is zero
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero..."); // Throwing an exception
        } else {
            ans = a / b; // Performing division
            System.out.println(ans); // Printing the result
        }
    }
}
