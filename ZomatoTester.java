package com.xworkzz.zomatoapp;

import com.xworkzz.zomatoapp.deliveryboys.DeliveryBoys;

public class ZomatoTester {
    public static void main(String[] args) {
        DeliveryBoys boy = new DeliveryBoys();
        Zomato zomato = new Zomato(boy);
        Zomato.boys.toDeliverFood();
    }
}
