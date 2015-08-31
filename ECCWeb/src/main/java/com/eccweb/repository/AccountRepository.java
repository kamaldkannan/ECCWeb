package com.eccweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eccweb.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

	Account findByUsername(String username);
	Account findOne(Long id);
    Account save(Account account);
    @Query("UPDATE Account a SET a.privateKey = :privateKey, a.publicKey = :publicKey  WHERE a.id = :accountId")
    int updateKey(@Param("accountId") Long accountId, @Param("privateKey") String privateKey, @Param("publicKey") String publicKey);
    @Query("UPDATE Account a SET a.remoteKey = :remoteKey  WHERE a.id = :accountId")
    int updateRemoteKey(@Param("accountId") Long accountId, @Param("remoteKey") String publicKey);
}
