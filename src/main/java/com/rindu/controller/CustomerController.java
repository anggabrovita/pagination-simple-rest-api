package com.rindu.controller;

import com.rindu.data.Customer;
import com.rindu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers/{pageNo}/{pageSize}")
    public List<Customer> getCustomer(@PathVariable int pageNo, @PathVariable int pageSize){
        return customerService.findAll(pageNo, pageSize);
    }

}
