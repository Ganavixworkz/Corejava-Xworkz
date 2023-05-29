package com.xworkzz.countryapp;

import com.xworkzz.countryapp.states.States;

public class CountryTester {

    public static void main(String[] args) {

        States  states= new States();
        Country  con = new Country(states);
        Country.states.tax();
    }
}
