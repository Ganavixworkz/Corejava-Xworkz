package com.xworkzz.hospitalapp.exception;

public class NotFoundWardException extends RuntimeException{
    public NotFoundWardException(int WardNo){
        System.out.println("No ward Number found"+WardNo);

    }
}
