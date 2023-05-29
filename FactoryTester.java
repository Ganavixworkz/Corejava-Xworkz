package com.xworkzz.factoryapp;

import com.xworkzz.factoryapp.machines.Machine;

public class FactoryTester {
    public static void main(String[] args) {
        Machine machine =  new Machine();
        Factory factory =  new Factory(machine);
        Factory.machine.toOPerate();
    }
}
