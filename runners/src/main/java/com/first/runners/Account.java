package com.first.runners;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Account {
    
    private String holderName;

    private String branch;

    @EmbeddedId
    private AccountPK accountPK;
}
