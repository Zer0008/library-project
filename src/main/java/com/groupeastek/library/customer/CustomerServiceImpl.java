package com.groupeastek.library.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements ICustomerService{

    @Autowired
    private ICustomerDao customerDao;

    @Override
    public List<Customer> findCustomerByLastName(String lastName) {
        return this.customerDao.findByLastName(lastName);
    }

    @Override
    public List<Customer> findCustomerByFirstName(String firstName) {
        return this.customerDao.findByFirstName(firstName);
    }

    @Override
    public Customer findCustomerByEmail(String email) {
        return this.customerDao.findByEmail(email);
    }

    @Override
    public List<Customer> findCustomerByJob(String job) {
        return this.findCustomerByJob(job);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return this.customerDao.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return this.customerDao.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        this.customerDao.delete(customer);
    }

    @Override
    public boolean checkIfCustomerExists(Customer customer) {
        if (this.customerDao.existsById(customer.getId()))
            return true;
        return false;
    }
}
