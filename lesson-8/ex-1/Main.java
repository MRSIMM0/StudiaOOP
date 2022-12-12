import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Weather weather = new Weather(new Forecast.Fake(), new Date());

        assert 20.2 == weather.predictedTemperatureAtCoordinates(12.2f,123.3f);

        System.out.println("OK");

    }
}