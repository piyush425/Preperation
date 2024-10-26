package DesignPattern.SOLID.OPENCLOSED;

public class rectangle extends shape{

    private Double length;
    private Double breadth;


    public rectangle(Double length,Double breadth) {
        this.length = length;
        this.breadth=breadth;
    }

    @Override
    public double area() {
        return length* breadth;
    }
}
