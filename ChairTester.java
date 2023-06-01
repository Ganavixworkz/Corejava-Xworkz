package com.xworkzz.plasticapp;

public class ChairTester {

    public static void main(String[] args) {
        Chair chair = new Plastic();
        float revenue = chair.toSit();
        System.out.println(revenue);
    }
}
