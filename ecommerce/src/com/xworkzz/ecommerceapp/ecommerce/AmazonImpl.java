package com.xworkzz.ecommerceapp.ecommerce;

import com.xworkzz.ecommerceapp.customer.Customer;
import com.xworkzz.ecommerceapp.exception.EmailNotFoundException;
import lombok.Data;

@Data
public class AmazonImpl implements Ecommerce {
    Customer customer[];
    int index;

    public AmazonImpl(int size) {
        customer = new Customer[size];
    }

    @Override
    public boolean addCustomer(Customer customer) {
        System.out.println("invoked addCustomer method");
        boolean isAdded = false;
        if (customer != null) {
            System.out.println("Customer check is completed...proceed to add customer");
            if (customer.getCustomerName() != null &&
                    !customer.getCustomerName().isEmpty() && customer.getAddress() != null
                    && !customer.getAddress().isEmpty()) {
                this.customer[index] = customer;
                index++;
                isAdded = true;
                System.out.println("customer name is added");

            } else {
                System.out.println("customer name is exceeded");
            }
        } else {


            System.out.println("no customer");
        }
        return isAdded;
    }

    @Override
    public void getAllCustomers() {
        System.out.println("invoked getAllCustomers");
        System.out.println("list of customers are:");
        for (Customer cus : customer) {
            System.out.println(cus);
        }
    }

    @Override
    public Customer getCustomerByAddress(String address) {
        Customer cus = null;
        for (Customer c1 : customer) {
            if (c1.getAddress().equals(address)) {
                System.out.println(cus = c1);
            } else {
                System.out.println("address not matched");
            }
            }
            return cus;
    }


    @Override
    public String getCustomerNameByCustomerId(int customerId) {
        System.out.println("invoked");
        String str=null;
        for (Customer c:customer) {
            if (c.getCustomerId() == customerId) {
                System.out.println(str=c.getCustomerName());
            }
        }
        return str;

    }

    @Override
    public boolean updateCustomerEmailIdByCustomerId(int existingId, String updateEmailId) {
        boolean isUpdated = false;
        for (Customer c:customer) {
            if (c.getCustomerId()==(existingId)) {
                c.setEmailId(updateEmailId);
                isUpdated = true;
                System.out.println(c);
            }
            else {
                EmailNotFoundException email = new EmailNotFoundException(existingId,updateEmailId);
                throw email;
            }
        }
        return isUpdated;

    }

    @Override
    public boolean updateCustomerAddressByCustomerName(String existingName, String updateAddress) {
        boolean isUpdated = false;
        for (Customer c:customer) {
            if (c.getCustomerName().equals(existingName)) {
                c.setAddress(updateAddress);
                isUpdated = true;
                System.out.println(c);
            }
        }
        return isUpdated;


    }
    @Override
    public Customer getCustomerById(int customerId) {
        System.out.println("invoked");
        Customer cus=null;
        for (Customer c:customer) {
            if (c.getCustomerId() == customerId) {
                System.out.println(cus=c);
            }
        }
        return cus;

    }
}
