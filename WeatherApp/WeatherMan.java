package WeatherApp;

import java.util.Random;

public class WeatherMan {

    private Random random;

    public WeatherMan() {
        this.random = new Random();
    }

    public String forecast() {
        double probability = this.random.nextDouble();
        if (probability <= 0.1) {
            return "it rains";
        } else if (probability <= 0.4) {
            return "it snows";
        }
        return "it shines";
    }

    public int makeAForecast() {
        return (int) (4 * this.random.nextGaussian() - 3);
    }
}
