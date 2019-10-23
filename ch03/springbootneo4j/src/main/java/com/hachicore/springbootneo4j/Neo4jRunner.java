package com.hachicore.springbootneo4j;

import com.hachicore.springbootneo4j.account.Account;
import com.hachicore.springbootneo4j.account.AccountRepository;
import com.hachicore.springbootneo4j.account.Role;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Neo4jRunner implements ApplicationRunner {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Account account = new Account();
//        account.setEmail("nkw8620@gmail.com");
//        account.setUsername("hachicore");
//
//        Role role = new Role();
//        role.setName("admin");
//
//        Session session = sessionFactory.openSession();
//        session.save(account);
//        sessionFactory.close();

        Account account = new Account();
        account.setUsername("rokuthread");
        account.setEmail("haru89@gmail.com");

        Role role = new Role();
        role.setName("user");

        account.getRoles().add(role);

        accountRepository.save(account);

        System.out.println("finished");
    }

}
