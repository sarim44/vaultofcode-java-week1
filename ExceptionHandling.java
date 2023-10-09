public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
// Vault of Codes Java intersnhip p3
// Sarim Farooq
        try {
            System.out.println(numbers[10]); // Accessing an out-of-bounds index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
         /*
       I added a try-catch block around the division operation to handle the
        ArithmeticException that occurs when dividing by zero.
*/

        try {
            int result = divide(10, 0); // Attempting to divide by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static int divide(int a, int b) {
        //Inside the method, we check if b is zero and, if so, throw an ArithmeticException
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}