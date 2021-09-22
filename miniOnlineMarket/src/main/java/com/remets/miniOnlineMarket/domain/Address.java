package com.remets.miniOnlineMarket.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty
    private String country;
    @NotEmpty
    private String state;
    @NotEmpty
    private  String city;
    @NotEmpty
    private String streetAddress;
    @NotEmpty
    private String zipCode;
    @NotEmpty
    @Valid
    private AddressType addressType;

}
