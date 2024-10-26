package DesignPattern.Structural.AdapterPattern.Adaptee;

public class BabyWeightMachine implements WeightMachine{
    @Override
    public double weightMachineInPound() {
        return 20;
    }
}
