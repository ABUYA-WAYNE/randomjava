package WeatherApp;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        WeatherMan forecaster = new WeatherMan();
        List<String> days = Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
        System.out.println("next week's weather forecast:");
        for (String day : days) {
            String weatherForecast = forecaster.forecast();
            int temperatureForecast = forecaster.makeAForecast();
            System.out.println(day + ": " + weatherForecast + " " + temperatureForecast + " degrees.");
            // System.out.println("" );--rAND TEST
            
        }
    }
}
