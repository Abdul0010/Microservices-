package com.abduk.user.service;

import com.abduk.clients.blacklist.BlacklistClient;
import com.abduk.user.domain.Customer;
import com.abduk.user.repository.CustomerRepository;
import com.abduk.user.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository userRepo;
    private final RestTemplate restTemplate;
    private final BlacklistClient blacklistClient;

    public void registerUser(UserRequest userRequest) {
        Customer customer = Customer
                .builder()
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .build();
       userRepo.saveAndFlush(customer);

        boolean isBlacklisted = blacklistClient.checkIfCustomerBlackListed(customer.getId());
        if(isBlacklisted){
           throw new IllegalArgumentException("customer is blacklisted");
       }
    }

    public List<Customer> getAllCustomers() {
        return userRepo.findAll();
    }

    public Customer getCustomer(Integer id) {
        return userRepo.findById(id).orElse(null);
    }
}
