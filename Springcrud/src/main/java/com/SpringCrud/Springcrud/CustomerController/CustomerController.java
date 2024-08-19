package com.SpringCrud.Springcrud.CustomerController;
import com.SpringCrud.Springcrud.DTO.CustomerDTO;
import com.SpringCrud.Springcrud.DTO.CustomerSaveDTO;
import com.SpringCrud.Springcrud.DTO.CustomerUpdateDTO;
import com.SpringCrud.Springcrud.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController
{
    @Autowired
    private CustomerService customerService;
    private CustomerUpdateDTO customerUpdateDTO;

    @PostMapping(path = "/save")

    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO)
    {
        String id = customerService.addCustomer(customerSaveDTO);
        return id;
    }

    @GetMapping(path = "/getAllCustomer")
    public List<CustomerDTO> getAllCustomer()
    {
        List<CustomerDTO> allCustomers = customerService.getAllCustomer();
        return allCustomers;
    }



    @PutMapping(path = "/update")

    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO)
    {
        this.customerUpdateDTO = customerUpdateDTO;
        String id = customerService.updateCustomers(customerUpdateDTO);
        return id;
    }

    @DeleteMapping(path = "/deletecustomer/{id}")
    public String deleteCustomer(@PathVariable(value = "id") int id)
    {
        boolean deletecustomer = customerService.deleteCustomer(id);
        return "deleted";
    }

}
