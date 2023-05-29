package com.xworkzz.laptopapp;

import com.xworkzz.laptopapp.harddisk.HardDisk;

public class LaptopTester {
    public static void main(String[] args) {
        HardDisk hardDisk  =  new HardDisk();
        Laptop laptop =  new Laptop(hardDisk);
        Laptop.disk.toWork();
    }
}
