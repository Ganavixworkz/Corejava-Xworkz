package com.xworkzz.ecommerceapp;

import com.xworkzz.ecommerceapp.constant.Gender;
import com.xworkzz.ecommerceapp.constant.PaymentType;
import com.xworkzz.ecommerceapp.customer.Customer;
import com.xworkzz.ecommerceapp.ecommerce.AmazonImpl;
import com.xworkzz.ecommerceapp.ecommerce.Ecommerce;
import com.xworkzz.ecommerceapp.exception.EmailNotFoundException;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("main is invoked");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the customer details to be added");
        int size = sc.nextInt();
        Ecommerce ecommerce = new AmazonImpl(size);
        for (int customerIndex = 0; customerIndex < size; customerIndex++) {

            Customer customer = new Customer();

            System.out.println("Enter the customer Id");
            customer.setCustomerId(sc.nextInt());
            System.out.println("Enter the customer Name");
            customer.setCustomerName(sc.next());
            System.out.println("Enter the customer PhoneNum");
            customer.setPhoneNumber(sc.nextLong());
            System.out.println("Enter e-mail Id");
            customer.setEmailId(sc.next());
            System.out.println("Enter the PassWard");
            customer.setPassword(sc.next());
            System.out.println("Enter the address");
            customer.setAddress(sc.next());
            System.out.println("Enter the gender type");
            customer.setGender(Gender.valueOf(sc.next()));
            System.out.println("Enter the Payment Type");
            customer.setType(PaymentType.valueOf(sc.next()));
            ecommerce.addCustomer(customer);


            String text = null;
            do {
                System.out.println("1:Get All the customer Details");
                System.out.println("2:Get Customer By Address");
                System.out.println("3:Get CustomerName By CustomerId");
                System.out.println("4:update Customer EmailId By CustomerId");
                System.out.println("5:update Customer Address By CustomerName");
                System.out.println("6:Get Customer By Id");


                int option = sc.nextInt();
                switch (option) {

                    case 1:
                        System.out.println("The  List  of customers  are:");
                        ecommerce.getAllCustomers();
                        break;
                    case 2:
                        System.out.println("enter the customer address");
                        ecommerce.getCustomerByAddress(sc.next());
                        break;
                    case 3:
                        System.out.println("enter the Id");
                        ecommerce.getCustomerNameByCustomerId(sc.nextInt());
                        break;
                    case 4:
                        System.out.println("enter the customer Id");
                        try {
                            ecommerce.updateCustomerEmailIdByCustomerId(sc.nextInt(), sc.next());
                        }catch (EmailNotFoundException e){
                            e.printStackTrace();
                        }
                        break;
                    case 5:
                        System.out.println("enter the customer name");
                        ecommerce.updateCustomerAddressByCustomerName(sc.next(), sc.next());
                        break;
                    case 6:
                        System.out.println("enter the customer Id");
                        ecommerce.getCustomerById(sc.nextInt());
                        break;
                }

            System.out.println("Do  you want to continue: y/n");
            text = sc.next();


        } while (text.equals("y")) ;
    }
}
}