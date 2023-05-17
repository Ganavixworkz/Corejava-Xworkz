package com.xworkzz.teashopapp;

public class TeaShop {

    String teaNames[] = new String[6];
    int  i;

    public boolean addName(String names)
    {
        boolean isAdded=false;
        if(names!=null && i<teaNames.length)
        {
            teaNames[i++] = names;
            isAdded = true;
        }
else {
    System.out.println("exceeded");
        }
return isAdded;
    }
public void getTeaNames()
{
    System.out.println("list of names are:");
    for(int i =0;i< teaNames.length;i++)
    {
        System.out.println(teaNames[i]);
    }
}
}
