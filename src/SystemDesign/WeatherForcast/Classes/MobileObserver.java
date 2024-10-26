package SystemDesign.WeatherForcast.Classes;

public class MobileObserver implements WeatherObserver{
    @Override
    public void update(WeatherData data) {
        System.out.println("Mobile View:"+ data.getTemperature());
    }
}
