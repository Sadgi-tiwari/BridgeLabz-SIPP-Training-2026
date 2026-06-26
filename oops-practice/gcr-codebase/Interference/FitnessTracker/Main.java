public class Main {

    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();

        // Calling default method from Trackable interface
        device.resetData();

        System.out.println();
        System.out.println("FitnessDevice implements multiple interfaces.");
        System.out.println("Java does not support multiple inheritance with classes.");
    }
}