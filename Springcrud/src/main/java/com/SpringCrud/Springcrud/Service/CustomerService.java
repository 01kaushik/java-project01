package com.SpringCrud.Springcrud.Service;

import com.SpringCrud.Springcrud.DTO.CustomerDTO;
import com.SpringCrud.Springcrud.DTO.CustomerSaveDTO;
import com.SpringCrud.Springcrud.DTO.CustomerUpdateDTO;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getAllCustomer();

    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

    boolean deleteCustomer(int id);
}