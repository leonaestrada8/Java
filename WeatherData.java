package Final.J4V4.Metereologia32;

public class WeatherData {
    private double[] temperatures;
    private double[] humidities;
    private double[] pressures;

    public WeatherData(double[] temperatures, double[] humidities, double[] pressures) {
        this.temperatures = temperatures;
        this.humidities = humidities;
        this.pressures = pressures;
    }

    private void calculateStatistics(double[] data) {
        double average = 0;
        double minimum = data[0];
        double maximum = data[0];

        for (double value : data) {
            average += value;
            if (value < minimum)
                minimum = value;
            if (value > maximum)
                maximum = value;
        }

        average /= data.length;

        System.out.println("Média: " + average);
        System.out.println("Mínima: " + minimum);
        System.out.println("Máxima: " + maximum);
    }

    public void report() {
        System.out.println("Estatísticas de Temperatura:");
        calculateStatistics(temperatures);

        System.out.println("\nEstatísticas de Umidade:");
        calculateStatistics(humidities);

        System.out.println("\nEstatísticas de Pressao:");
        calculateStatistics(pressures);
    }

    public static void main(String[] args) {
        double[] temperatures = { 20, 22, 18, 19, 23 };
        double[] humidities = { 60, 55, 58, 57, 59 };
        double[] pressures = { 1000, 1005, 999, 1003, 1001 };

        WeatherData weatherData = new WeatherData(temperatures, humidities, pressures);
        weatherData.report();
    }
}
