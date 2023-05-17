package com.xworkzz.oranapp;
import java.util.Scanner;
public class OrianMallTester {

    public  static  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        OrianMall orianMall = new OrianMall();
        for(int  i=0;i<orianMall.shopNames.length;i++)
        {
            System.out.println("Enter  the  ShopNames");
            String  names = sc.next();
            orianMall.addNames(names);
        }
                orianMall.getShopNames();
    }
}
