package com.abduk.user.controller;

import com.abduk.user.domain.Customer;
import com.abduk.user.service.CustomerService;
import com.abduk.user.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/customers")
public class CustomerController {

    private final CustomerService userService;
    @PostMapping
    public void registerUser(@RequestBody UserRequest userRequest){
        log.info("register new user {}", userRequest);
        userService.registerUser(userRequest);

    }
    @GetMapping
    public List<Customer> getAllCustomers(){
        return userService.getAllCustomers();
    }
    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable Integer customerId){
        log.info("customer id: "+customerId);
        return userService.getCustomer(customerId);
    }

}
