package net.tongark.webmvc.config.services.impl;

import net.tongark.spring.webservice.account.Account;
import net.tongark.spring.webservice.account.AccountService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Override
    public void insertAccount(Account acc) {
        // do something...
    }

    @Override
    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        Account account=new Account();
        account.setName("David's Account");
        accounts.add(account);
        return accounts;
    }
}
