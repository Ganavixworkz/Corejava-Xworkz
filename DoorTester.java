package com.xworkzz.doorapp;

public class DoorTester {

    public static void main(String[] args) {
        Door door = new Wood();
        double cost = door.toConstruct();
        System.out.println(cost);
    }
}
