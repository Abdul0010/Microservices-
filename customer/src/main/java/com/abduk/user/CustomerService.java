package com.abduk.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository userRepo;
    private final RestTemplate restTemplate;


    public void registerUser(UserRequest userRequest) {
        Customer customer = Customer
                .builder()
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .build();
       userRepo.saveAndFlush(customer);
       boolean isBlacklisted= restTemplate.getForObject("http://BLACKLIST/api/v1/BlackListChecker/{customerId}",
                boolean.class,customer.getId());
       if(isBlacklisted){
           throw new IllegalArgumentException("customer is blacklisted");
       }
    }
}
