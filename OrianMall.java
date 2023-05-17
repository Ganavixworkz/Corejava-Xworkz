package com.xworkzz.oranapp;

public class OrianMall {

    String shopNames[] =  new  String[5];
    int  i;

    public  boolean addNames(String names)
    {
        boolean  isAdded = false;
        if(names !=null && i<shopNames.length)
        {
            shopNames[i++] = names;
            isAdded = true;
        }
        return isAdded;
    }
    public  void getShopNames()
    {
        System.out.println("list of shopes");
        for(int i=0;i<shopNames.length;i++)
        {
            System.out.println(shopNames[i]);
        }
    }
}
