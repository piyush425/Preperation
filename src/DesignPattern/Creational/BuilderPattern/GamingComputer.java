package DesignPattern.Creational.BuilderPattern;

public class GamingComputer extends ComputerBuilder{
    @Override
    void buildCpu() {
        computer.setCPU("CPU");
    }

    @Override
    void buildGpu() {
        computer.setGPU("GPU");
    }

    @Override
    void buildRam() {
        computer.setRam("Ram");

    }
}
