package com.bank.customer.service;

import com.bank.customer.exception.CustomerNotFoundException;
import com.bank.customer.exception.InvalidRequestException;
import com.bank.customer.model.Customer;
import com.bank.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        if(id<=0){
            throw new CustomerNotFoundException("invalid customer");
        }
        if(customerRepository.findById(id).isPresent()){
            return customerRepository.findById(id);
        }
        else{
            throw new InvalidRequestException("Invalid Request Body");
        }
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        if(customerRepository.findById(id).isPresent()){
            customerRepository.deleteById(id);
        }
        else {
            throw new CustomerNotFoundException("Invalid Customer");
        }
    }
}
