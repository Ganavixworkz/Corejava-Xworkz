package com.xworkzz.ecommerceapp.ecommerce;

import com.xworkzz.ecommerceapp.customer.Customer;

public interface Ecommerce {


    boolean addCustomer(Customer customer);

    void getAllCustomers();
    String getCustomerByAddress(String address);
    String getCustomerNameByCustomerId(int customerId);
    boolean updateCustomerEmailIdByCustomerId(int existingId,String updateEmailId);

    boolean updateCustomerAddressByCustomerName(String existingName,String updateAddress);

    Customer getCustomerById(int customerId);

}
