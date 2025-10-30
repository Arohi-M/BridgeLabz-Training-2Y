public class SensorDataLogger {
    public static void logData(double primitiveData, Double wrapperData) {
        Double boxed = primitiveData;
        double unboxed = wrapperData;
        System.out.println("Boxed: " + boxed + ", Unboxed: " + unboxed);
    }
    public static void main(String[] args) {
        logData(36.5, 37.2);
    }
}