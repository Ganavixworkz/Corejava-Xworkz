package com.xworkzz.bankaccountsapp;

public class SavingsAccountTester {

    public static void main(String[] args) {
        SavingsAccount ramAccount = new SavingsAccount();
        ramAccount.credit(100000);
        System.out.println("current balance in  ram account: " + ramAccount.getBalance());



        SavingsAccount zudioAccount = new SavingsAccount();
        ramAccount.transfer(zudioAccount,10000);
        System.out.println("zudio account is credited by: " + zudioAccount.getBalance());
        System.out.println("current balance in ram account: " + ramAccount.getBalance());

        SavingsAccount maxAccount = new SavingsAccount();
        ramAccount.transfer(maxAccount,20000);
        System.out.println("max account  is credited by: " + maxAccount.getBalance());
        System.out.println("current balance in ram account: " + ramAccount.getBalance());

        SavingsAccount goldShop = new SavingsAccount();
        ramAccount.transfer(goldShop,10000);
        System.out.println(" gold shop account is credited by: " + goldShop.getBalance());
        System.out.println("current balance in ram account: " + ramAccount.getBalance());

        SavingsAccount zaraAccount = new SavingsAccount();
        ramAccount.transfer(zaraAccount,10000);
        System.out.println(" zara account is credited by: " + zaraAccount.getBalance());
        System.out.println("current balance in ram account: " + ramAccount.getBalance());

        SavingsAccount tvShowRoomAccount = new SavingsAccount();
        ramAccount.transfer(tvShowRoomAccount,10000);
        System.out.println(" tv show room account  credited by: " + tvShowRoomAccount.getBalance());
        System.out.println("current balance in ram account: " + ramAccount.getBalance());

        SavingsAccount cycleShopAccount = new SavingsAccount();
        ramAccount.transfer(cycleShopAccount,10000);
        System.out.println(" cycle shop account  credited by: " + cycleShopAccount.getBalance());
        System.out.println("current balance in ram account: " + ramAccount.getBalance());

        SavingsAccount tilesShopAccount = new SavingsAccount();
        ramAccount.transfer(tilesShopAccount,10000);
        System.out.println(" tiles shop account is credited by: " + tilesShopAccount.getBalance());
        System.out.println("current balance in ram account: " + ramAccount.getBalance());

        SavingsAccount furnitureShopAccount = new SavingsAccount();
        ramAccount.transfer(furnitureShopAccount,10000);
        System.out.println(" furniture shop account is credited by: " + furnitureShopAccount.getBalance());
        System.out.println("current balance in ram account: " + ramAccount.getBalance());


    }
}
