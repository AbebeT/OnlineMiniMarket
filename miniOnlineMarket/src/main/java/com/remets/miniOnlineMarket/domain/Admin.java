package com.remets.miniOnlineMarket.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
