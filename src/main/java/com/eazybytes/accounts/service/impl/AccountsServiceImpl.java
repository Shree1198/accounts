package com.eazybytes.accounts.service.impl;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Customer;
import com.eazybytes.accounts.repository.AccountsRepository;
import com.eazybytes.accounts.repository.CustomerRepository;
import com.eazybytes.accounts.service.CustomerMapper;
import com.eazybytes.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    private ModelMapper mapper;
    @Override
    public void creatAccount(CustomerDto customerDto) {
       // Customer customer = new Customer();
          //
        // CustomerMapper.mapToCustomer(customerDto,customer);

        Customer customer   = mapper.map(customerDto,Customer.class);
    }
}
