package DesignPattern.Creational.BuilderPattern;

public class OfficeComputer extends ComputerBuilder{
    @Override
    void buildCpu() {
        computer.setCPU("CPU OFFICE");
    }

    @Override
    void buildGpu() {
        computer.setGPU("GPU OFFICE");

    }

    @Override
    void buildRam() {
        computer.setRam("Ram OFFICE");
    }
}
