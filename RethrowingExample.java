public class RethrowingExample {
    public static void main(String[] args) {
        // Reading input from command-line arguments and converting them to integers
        int a = Integer.parseInt(args[0]); // First argument (numerator)
        int b = Integer.parseInt(args[1]); // Second argument (denominator)
        int ans = 0; // Variable to store the division result

        try {
            // Inner try block for performing division
            try {
                // Checking if denominator is zero
                if (b == 0)
                    throw new ArithmeticException(); // Throw exception if division by zero occurs
                else {
                    ans = a / b; // Perform division
                    System.out.println("Division performed...");
                }
            } 
            // Catch block for handling ArithmeticException in the inner try
            catch (ArithmeticException e) {
                System.out.println("Thrown in inner try and catch --- Divide by zero : " + e);
                ans = -999; // Assigning a default error value
                throw e; // Rethrowing the exception to be caught in the outer try
            }
        } 
        // Outer catch block to handle the rethrown exception
        catch (ArithmeticException e) {
            System.out.println("Thrown in outer try and catch --- Divide by zero : " + e);
        }

        // Printing final result
        System.out.println("ANS : " + ans);
        System.out.println("Pg terminated"); // Program termination message
    }
}
