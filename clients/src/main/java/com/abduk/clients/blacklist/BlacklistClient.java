package com.abduk.clients.blacklist;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("BLACKLIST")
public interface BlacklistClient {
    @GetMapping(path = "api/v1/BlackListChecker/{customerId}")
     boolean checkIfCustomerBlackListed(@PathVariable("customerId") Integer customerId);

}
