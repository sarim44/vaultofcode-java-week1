package internshipvoc;
// Vault of Codes Java intersnhip p1
public class ArrayManipulation {
    public static void main(String[] args) {
        // Initialising Array
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            /* Sarim Farooq
            for loop conditon had <= , which made the program give an error (array out of bound)
            at i=5
             */
            System.out.println(numbers[i]);
        }
    }
}

