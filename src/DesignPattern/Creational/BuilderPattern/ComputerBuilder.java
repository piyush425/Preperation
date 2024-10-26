package DesignPattern.Creational.BuilderPattern;

public abstract class ComputerBuilder {

    protected  Computer computer;

    public void createComputer(){
         this.computer=new Computer();
    }

    abstract void buildCpu();
    abstract void buildGpu();
    abstract void buildRam();
}
