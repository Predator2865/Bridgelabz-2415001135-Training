
import java.io.Serializable;

class Employee implements Serializable {
    int id;
    String name;
}

public class MarkerInterfaceExample {
    public static void main(String[] args) {
        System.out.println("Employee is serializable due to marker interface.");
    }
}
