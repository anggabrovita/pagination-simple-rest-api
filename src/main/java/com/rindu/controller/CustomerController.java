package com.rindu.controller;

import com.rindu.data.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {

    List<Customer> customer = Arrays.asList(
            new Customer("1","Alexa", "Jl. in aja dulu", "alexa@example.com", "02111111"),
            new Customer("2","john", "Jl. nya sama aku, nikahnya sama dia", "john@example.com", "02156122"),
            new Customer("3","Ria", "Jl. mulu, naik mobil kek", "ria@example.com", "02131133"),
            new Customer("4","Rudi", "Jl. mulu, naik mobil kek", "rudi@example.com", "02141844"),
            new Customer("5","Tasya", "Jl. mulu, naik mobil kek", "tasya@example.com", "02151955"),
            new Customer("6","Baras", "Jl. mulu, naik mobil kek", "Baras@example.com", "02116066"),
            new Customer("7","Tono", "Jl. ini mengingatkannya tentang dia", "tono@example.com", "02112177")
    );

    @GetMapping("/customers")
    public List<Customer> getCustomer(){
        return customer;
    }

}
