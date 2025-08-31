import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Create a String array to store results
        String[] results = new String[n + 1]; 

        // Loop through numbers and apply FizzBuzz logic
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Print results
        for (int i = 1; i <= n; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
