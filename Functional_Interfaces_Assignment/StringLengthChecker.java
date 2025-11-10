
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthCheck = str -> str.length();
        System.out.println("Length: " + lengthCheck.apply("Hello World"));
    }
}
