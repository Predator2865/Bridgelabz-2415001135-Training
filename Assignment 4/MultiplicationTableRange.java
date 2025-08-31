import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] multiplicationResult = new int[4]; // for 6 to 9

        // Calculate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = num * i;
        }

        // Display result
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + multiplicationResult[i - 6]);
        }
        sc.close();
    }
}
