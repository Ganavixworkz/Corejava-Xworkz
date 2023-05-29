package com.xworkzz.mallapp;

import com.xworkzz.mallapp.shops.Shop;

public class MallTester {

    public static void main(String[] args) {

        Shop shop =new Shop();
        Mall mall = new Mall(shop);

        mall.shop.doBussiness();

    }
}
