import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Count digits
        int temp = num;
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        // Store digits in array
        int[] digits = new int[count];
        temp = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Create reverse array
        int[] reverse = new int[count];
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        // Display reverse array
        System.out.print("Reversed digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i] + " ");
        }
    }
}
