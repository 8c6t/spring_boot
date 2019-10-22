package com.hachicore.springbootjpa.account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

//    @Query(nativeQuery = true, value = "SELECT * FROM account WHERE username = '{0}'")
    Optional<Account> findByUsername(String username);
}
