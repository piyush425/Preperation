package DesignPattern.Creational.BuilderPattern;

public class ComputerDirector {

    private ComputerBuilder computerBuilder;

    public void setComputer(ComputerBuilder builder){
        this.computerBuilder=builder;
    }

    public Computer buildCoumputer(){
        computerBuilder.createComputer();
        computerBuilder.buildCpu();
        computerBuilder.buildGpu();
        computerBuilder.buildRam();
        return computerBuilder.computer;
    };
}
