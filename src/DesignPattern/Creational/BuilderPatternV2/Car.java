package DesignPattern.Creational.BuilderPatternV2;

public class Car {

    private String Engine;
    private String Wheel;

    private boolean airBag;

    @Override
    public String toString() {
        return "Car{" +
                "Engine='" + Engine + '\'' +
                ", Wheel='" + Wheel + '\'' +
                ", airBag=" + airBag +
                '}';
    }

    public Car(String Engine,String Wheel, Boolean airBag) {
        this.Engine = Engine;
        this.Wheel = Wheel;
        this.airBag=airBag;
    }



}
