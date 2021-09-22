package com.remets.miniOnlineMarket.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

@Valid
    @OneToMany
    private List<@Valid Product> products;
@Valid
    @OneToOne(cascade = CascadeType.MERGE) //refer
    private Buyer buyer;




}
