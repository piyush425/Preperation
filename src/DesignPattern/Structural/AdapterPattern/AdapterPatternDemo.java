package DesignPattern.Structural.AdapterPattern;

import DesignPattern.Structural.AdapterPattern.Adaptee.BabyWeightMachine;
import DesignPattern.Structural.AdapterPattern.Adaptee.WeightMachine;
import DesignPattern.Structural.AdapterPattern.Adapter.WeightMachineAdapter;
import DesignPattern.Structural.AdapterPattern.Adapter.WeightMachineInKg;


/**
 * The Adapter Design Pattern acts like a translator between two incompatible interfaces, allowing them to work together.
 * It wraps an existing class, converting its interface into another interface that a client expects.
 * This way, you can use a class with a different interface without modifying its original code.
 */

public class AdapterPatternDemo {

    public static void main(String[] args) {

        WeightMachine babyWeightInpound=new BabyWeightMachine();

        WeightMachineInKg weightMachineInKg=new WeightMachineAdapter(babyWeightInpound);

        System.out.println(weightMachineInKg.weightMachineInKg());

    }


}
