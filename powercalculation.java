import java.util.Scanner;

public class powercalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base: ");
        double base = sc.nextDouble();

        System.out.print("Enter Exponent: ");
        double exponent = sc.nextDouble();

        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " = " + result);

        sc.close();
    }
}
