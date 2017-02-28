package com.pluralsight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pluralsight.repository.CustomerHibernate;

/**
 * Created by ritesh on 2/18/17.
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    //@Autowired
    CustomerHibernate customerHibernate;

    @Autowired
    public void setCustomerHibernate(CustomerHibernate customerHibernate) {
        this.customerHibernate = customerHibernate;
    }

    public void setCustomerFirstName() {
        customerHibernate.setCustomer("Ritesh");
    }

    public String findCustomer() {
        setCustomerFirstName();
        return customerHibernate.findCustomer();
    }
}
