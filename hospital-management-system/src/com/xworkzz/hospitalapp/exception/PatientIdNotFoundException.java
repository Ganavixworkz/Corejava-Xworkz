package com.xworkzz.hospitalapp.exception;

public class PatientIdNotFoundException extends RuntimeException{

    public PatientIdNotFoundException(){
        System.out.println("Invalid Id");
    }
}
