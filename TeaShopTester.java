package com.xworkzz.teashopapp;
import java.util.Scanner;
public class TeaShopTester {

    public static void main(String args[])
    {
Scanner sc = new Scanner(System.in);
    TeaShop teashop = new TeaShop();
    for(int i=0; i<teashop.teaNames.length;i++)
    {
        System.out.println("Enter the Tea Names");
        String names=sc.next();
        teashop.addName(names);
    }
    teashop.getTeaNames();
}
}
