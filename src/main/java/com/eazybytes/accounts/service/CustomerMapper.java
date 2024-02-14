package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.AccountsDto;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Accounts;
import com.eazybytes.accounts.entity.Customer;

public class CustomerMapper {

    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
//        accountsDto.setAccountNumber(accounts.getAccountNumber());
//        accountsDto.setAccountType(accounts.getAccountType());
//        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
//        accounts.setAccountNumber(accountsDto.getAccountNumber());
//        accounts.setAccountType(accountsDto.getAccountType());
//        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return customer;
    }
}
