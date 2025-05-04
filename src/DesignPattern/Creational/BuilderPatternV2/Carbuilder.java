package DesignPattern.Creational.BuilderPatternV2;

public class Carbuilder {
    private String Engine;
    private String Wheel;

    public Carbuilder setAirBag(boolean airBag) {
        this.airBag = airBag;
        return  this;
    }

    private boolean airBag;


    public Carbuilder(String engine, String wheel) {
        Engine = engine;
        Wheel = wheel;
    }

    public Car build(){
        return new Car(Engine,Wheel,airBag);
    }
}
