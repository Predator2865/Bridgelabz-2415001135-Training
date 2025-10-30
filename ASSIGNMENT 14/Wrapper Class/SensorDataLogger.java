public class SensorDataLogger {

    
    public static void logTemperature(Double temperature) {
        
        System.out.println("Logging temperature: " + temperature + "°C");

        if (temperature == null) {
            System.out.println("Error: No temperature data available!\n");
        } else {
            
            double tempInFahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + tempInFahrenheit + "°F\n");
        }
    }

    public static void main(String[] args) {
    
        double sensorData1 = 28.5;
        
        Double sensorData2 = 31.2;
    
        Double sensorData3 = null;

        
        logTemperature(sensorData1);

        
        logTemperature(sensorData2);

        logTemperature(sensorData3);
    }
}
