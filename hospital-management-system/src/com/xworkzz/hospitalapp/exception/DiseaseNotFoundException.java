package com.xworkzz.hospitalapp.exception;

public class DiseaseNotFoundException extends RuntimeException{

    public DiseaseNotFoundException(){
        System.out.println("Enter the correct Disease");
    }
}
