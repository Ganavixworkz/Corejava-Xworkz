package com.xworkzz.ecommerceapp.customer;

import com.xworkzz.ecommerceapp.constant.Gender;
import com.xworkzz.ecommerceapp.constant.PaymentType;
import lombok.Data;

@Data
public class Customer {
    private int customerId;
    private String customerName;
    private String emailId;
    private String address;
    private long phoneNumber;
    private String password;
    Gender gender;
    PaymentType type;

}
