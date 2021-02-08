package com.rindu.service;

import com.rindu.data.Customer;
import com.rindu.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerServices{

    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> findAll(int pageNo, int pageSize) {
        Pageable paging= PageRequest.of(pageNo, pageSize) ;
        Page<Customer> pagedResult = repository.findAll(paging);
        return pagedResult.toList();
    }
}
