package com.xworkzz.companyapp;

import com.xworkzz.companyapp.brands.Brand;

public class CompanyTester {

    public static void main(String[] args) {
        Brand brandss = new Brand();
        Company company = new Company(brandss);
        Company.brand.toDoBussiness();
    }
}
