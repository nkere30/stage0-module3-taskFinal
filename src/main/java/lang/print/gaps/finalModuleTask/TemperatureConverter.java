package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void toFahrenheit(int temperatureCelsius){
        double temperatureFarenheit = temperatureCelsius * 1.8 + 32;
        System.out.println(temperatureFarenheit);
    }

    public static void main(String[] args) {
        toFahrenheit(1);
    }
}
