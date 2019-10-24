package com.hachicore.springbootsecurity2;

import com.hachicore.springbootsecurity2.account.Account;
import com.hachicore.springbootsecurity2.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account hachicore = accountService.createAccount("hachicore", "1234");
        System.out.printf("%s password: %s", hachicore.getUsername(), hachicore.getPassword());
    }

}
