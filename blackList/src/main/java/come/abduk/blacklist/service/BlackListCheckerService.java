package come.abduk.blacklist.service;

import come.abduk.blacklist.domain.BlackListChecker;
import come.abduk.blacklist.repository.BlackListedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BlackListCheckerService {

    @Autowired
    private BlackListedRepository blackListedRepository;

    public boolean isCustomerBlackListed(Integer customerId){
        blackListedRepository.save(BlackListChecker.builder()
                .userId(customerId)
                .isBlacklisted(false)
                .createdAt(LocalDateTime.now()).build());
        return false;
    }

}
