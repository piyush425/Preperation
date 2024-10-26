package SystemDesign.WeatherForcast.Classes;

public class TvObserver implements WeatherObserver{
    @Override
    public void update(WeatherData data) {
        System.out.println("Tv Observer: "+ "Temeperature -->"+data.getTemperature());
    }
}
