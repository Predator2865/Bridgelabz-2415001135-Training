
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface SecurityUtils {
    static boolean isStrong(String pass) {
        return pass.length() >= 8 && pass.matches(".*[A-Z].*") && pass.matches(".*\d.*");
    }
}

interface Converter {
    static double kmToMiles(double km) { return km * 0.621371; }
    static double kgToLbs(double kg) { return kg * 2.20462; }
}

interface DateUtil {
    static String format(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

public class StaticMethodsInterfaceDemo {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrong("Abcd1234"));
        System.out.println(Converter.kmToMiles(5));
        System.out.println(DateUtil.format(LocalDate.now(), "dd/MM/yyyy"));
    }
}
