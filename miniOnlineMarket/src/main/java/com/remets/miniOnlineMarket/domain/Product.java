package com.remets.miniOnlineMarket.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long productId;

    @Column(name = "product_name")
    private String name;


    private String category;
    // @Digits(integer = 5, fraction = 2, message = "exceed the given limit")
    private double price;

    private int quantity;

    private String description;

    @ManyToMany(mappedBy = "products")

    private Set<Seller> sellers;

    @ManyToMany(mappedBy = "products")
    @JsonIgnore

    private Set<Order> orders;
    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<Review> reviews;


}

