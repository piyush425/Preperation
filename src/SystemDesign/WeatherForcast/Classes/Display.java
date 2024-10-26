package SystemDesign.WeatherForcast.Classes;

public class Display {

    public static WeatherObserver createbserver(String type){

        if (type.equalsIgnoreCase("Mobile")) {
            return new MobileObserver();
        } else if (type.equalsIgnoreCase("TV")) {
            return new TvObserver();
        } else {
            throw new IllegalArgumentException("Unknown display type");
        }
    }
}
