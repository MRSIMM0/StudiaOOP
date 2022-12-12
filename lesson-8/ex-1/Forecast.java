import java.util.Date;

public interface Forecast {

    double todayTemperatureInCellicious(double lat, double lang, Date date);

    final class Fake implements Forecast{

        @Override
        public double todayTemperatureInCellicious(double lat, double lang,Date date) {
            return 20.2;
        }
    }


}
