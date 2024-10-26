package DesignPattern.Structural.AdapterPattern.Adapter;

import DesignPattern.Structural.AdapterPattern.Adaptee.WeightMachine;

public class WeightMachineAdapter implements WeightMachineInKg {

    WeightMachine weightMachine;

    public WeightMachineAdapter(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }


    @Override
    public double weightMachineInKg() {
        double poundIntoKg=weightMachine.weightMachineInPound() * .45;
        return poundIntoKg;

    }
}
