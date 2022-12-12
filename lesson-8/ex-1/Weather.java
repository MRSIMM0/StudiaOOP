import java.util.Date;

public class Weather {

    private final Forecast forecast;

    private final Date date;


    public Weather(Forecast forecast,Date date) {
        this.forecast = forecast;
        this.date = date;
    }

    public Double predictedTemperatureAtCoordinates(float latitude, float longitude){
        return forecast.todayTemperatureInCellicious(latitude,longitude,this.date);
    }

}
