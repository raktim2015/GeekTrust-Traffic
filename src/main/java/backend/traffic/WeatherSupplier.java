import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier; 
class WeatherSupplier
{
    private static final Map<String,Supplier<Weather> > WEATHER_SUPPLIER;
    static{
        final Map <String,Supplier<Weather> > weathers = new HashMap<>();
        weathers.put("RAINY",Rainy::new);
        weathers.put("WINDY",Windy::new);
        weathers.put("SUNNY",Sunny::new);

        WEATHER_SUPPLIER = Collections.unmodifiableMap(weathers);

    }
    public Weather supplyWeather(String weatherType)
    {
        Supplier <Weather> weather = WEATHER_SUPPLIER.get(weatherType);
        if(weather == null)
        {
            throw new IllegalArgumentException("Invalid weather type "+weatherType);
        }
        return weather.get();
    }
}