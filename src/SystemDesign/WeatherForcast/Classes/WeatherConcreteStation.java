package SystemDesign.WeatherForcast.Classes;

import java.util.ArrayList;
import java.util.List;

public class WeatherConcreteStation implements WeatherStation{

    private WeatherData weatherData;
    private List<WeatherObserver> weatherObservers;

    public WeatherConcreteStation() {
        this.weatherObservers = new ArrayList<>();
    }

    @Override
    public void addWeatherObserver(WeatherObserver weatherObserver) {

        weatherObservers.add(weatherObserver);

    }

    @Override
    public void removeWeatherObserver(WeatherObserver weatherObserver) {

        weatherObservers.remove(weatherObserver);

    }

    @Override
    public void notifyWeatherObserver() {

        for (WeatherObserver weatherObserver:weatherObservers){
            weatherObserver.update(weatherData);
        }

    }

    void setWeatherData(WeatherData weatherData){
        this.weatherData=weatherData;
        notifyWeatherObserver();
    }
}
