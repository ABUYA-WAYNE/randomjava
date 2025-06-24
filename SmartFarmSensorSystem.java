import java.util.Random;

public class SmartFarmSensorSystem {

    public static void main(String[] args) {
        // Create the main Random generator
        Random random = new Random();

        // ----------------- SENSOR READING SIMULATION ------------------

        // Random int → simulate device uptime in minutes
        int uptimeMinutes = random.nextInt(10000); // 0 to 9999

        // Random int with bound → simulate soil pH level bucket (0–13)
        int soilPhBucket = random.nextInt(14);

        // Random float → simulate humidity sensor (0.0 to 1.0 = 0% to 100%)
        float humidity = random.nextFloat() * 100;

        // Random double → simulate chance of pest attack (0.0 to 1.0)
        double pestAttackProbability = random.nextDouble();

        // Random boolean → rain detector switch (true = raining)
        boolean isRaining = random.nextBoolean();

        // Random long → simulate a unique sensor ID
        long sensorId = random.nextLong();

        // Random Gaussian → simulate temperature with natural variation
        double temperature = 25 + random.nextGaussian() * 5; // Mean = 25, std = 5

        // Reproducible random event with seed
        Random testSensor = new Random(12345);
        int reproducibleUptime = testSensor.nextInt(10000);

        // ---------------------- OUTPUT ------------------------

        System.out.println("🌱 Smart Farm Sensor Report:");
        System.out.println("-----------------------------");
        System.out.println("Sensor ID: " + sensorId);
        System.out.println("Device uptime: " + uptimeMinutes + " minutes");
        System.out.println("Soil pH bucket: " + soilPhBucket + " (0 = acidic, 14 = alkaline)");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Pest Attack Probability: " + pestAttackProbability);
        System.out.println("Rain Detected: " + isRaining);
        System.out.printf("Temperature: %.2f °C\n", temperature);
        System.out.println("Reproducible Uptime (seeded): " + reproducibleUptime);
    }
}
