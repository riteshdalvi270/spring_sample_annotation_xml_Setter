package com.pluralsight.repository;

/**
 * Created by ritesh on 2/18/17.
 */
public interface CustomerHibernate {

    void setCustomer(String firstName);

    String findCustomer();
}
