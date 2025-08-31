import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int[] frequency = new int[10];
        long temp = number;

        if (number == 0) {
            frequency[0] = 1;
        } else {
            while (temp != 0) {
                int digit = (int)(temp % 10);
                frequency[digit]++;
                temp /= 10;
            }
        }

        System.out.println("Digit Frequency in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " -> " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
