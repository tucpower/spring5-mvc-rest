package com.jrt.spring5mvcrest.api.mapper;

import com.jrt.spring5mvcrest.api.model.CustomerDTO;
import com.jrt.spring5mvcrest.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    //@Mapping(source = "id", target = "id")
    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDTOToCustomer(CustomerDTO customerDTO);
}
