package net.tongark.spring.webmvc.controllers.rmi;

import net.tongark.spring.webservice.account.Account;
import net.tongark.spring.webservice.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rmi")
public class LinkRmiServiceController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    public List<Account> accounts(){
        return accountService.getAccounts();
    }
}
