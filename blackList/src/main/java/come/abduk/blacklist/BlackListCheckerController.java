package come.abduk.blacklist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/BlackListChecker")
public class BlackListCheckerController {

    @Autowired
    private BlackListCheckerService blackListCheckerService;

    @GetMapping(path = "{customerId}")
    public boolean checkIfCustomerBlackListed(@PathVariable("customerId") Integer customerId){

        return blackListCheckerService.isCustomerBlackListed(customerId);
    }

}
