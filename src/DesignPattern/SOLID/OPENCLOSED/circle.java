package DesignPattern.SOLID.OPENCLOSED;

public class circle extends shape{

    private Double radius;

    public circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2*3.15*radius;
    }
}
