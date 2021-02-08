package com.rindu.service;

import com.rindu.data.Customer;

import java.util.List;

public interface CustomerServices {
    List<Customer> findAll(int pageNo, int pageSize);
}
