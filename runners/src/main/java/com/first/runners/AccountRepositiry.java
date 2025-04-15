package com.first.runners;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  AccountRepositiry extends JpaRepository<Account,AccountPK> {
    
}
