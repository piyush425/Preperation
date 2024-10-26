package SystemDesign.WeatherForcast.Classes;


/**
 * Definition: The Observer Pattern is a behavioral design pattern that allows an object (called the subject)
 * to notify a list of dependents (called observers) automatically when its state changes.
 * This pattern is useful when you have an object that needs to inform other objects about changes without knowing who those objects are.
 *
 * Easy Example: Imagine you have a news channel (subject) and multiple subscribers (observers).
 * When the news channel has breaking news, it should notify all subscribers.
 * The news channel does not need to know who its subscribers are; it just updates all of them whenever there is new content.
 */

public class WeatherMain {

    public static void main(String[] args) {

        WeatherConcreteStation weatherConcreteStation=new WeatherConcreteStation();

        WeatherObserver weatherObserver=Display.createbserver("mobile");

        weatherConcreteStation.addWeatherObserver(weatherObserver);

        WeatherData weatherData=new WeatherData(23,23,98);

        weatherConcreteStation.setWeatherData(weatherData);



    }
}
