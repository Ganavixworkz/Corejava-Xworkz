package com.xworkzz.ecommerceapp.exception;

public class EmailNotFoundException extends RuntimeException{
    public EmailNotFoundException(int id,String emailId){
        System.out.println("Invalid email Id"+ id +"\n "+emailId+ "\n");
    }
}

