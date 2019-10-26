package com.groupeastek.library.customer;


import java.util.List;

public interface ICustomerService {

    public List<Customer> findCustomerByLastName(String lastName);

    public List<Customer> findCustomerByFirstName(String firstName);

    public Customer findCustomerByEmail(String email);

    public List<Customer> findCustomerByJob(String job);

    public Customer saveCustomer(Customer customer);

    public Customer updateCustomer(Customer customer);

    public void deleteCustomer(Customer customer);

    public boolean checkIfCustomerExists(Customer customer);
}
