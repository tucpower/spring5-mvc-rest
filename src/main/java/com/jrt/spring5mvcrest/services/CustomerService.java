package com.jrt.spring5mvcrest.services;

import com.jrt.spring5mvcrest.api.model.CategoryDTO;
import com.jrt.spring5mvcrest.api.model.CustomerDTO;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Long id);

    CustomerDTO createNewCustomer(CustomerDTO customerDTO);
}
