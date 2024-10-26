package SystemDesign.WeatherForcast.Classes;

public interface WeatherStation {

    void addWeatherObserver(WeatherObserver weatherObserver);

    void removeWeatherObserver(WeatherObserver weatherObserver);

    void notifyWeatherObserver();

}
