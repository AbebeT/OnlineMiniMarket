package com.remets.miniOnlineMarket.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
@Valid
    private OrderStatus orderStatus;

    @Valid
    @ManyToOne
    @JoinColumn(name= "buyer_id")
    private Buyer buyer;
@Valid
    @ManyToOne
    private Address shippingAddress;
@Valid
    @ManyToOne
    private Address billingAddress;
@Valid
    @ManyToMany(cascade =CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="order_product")
    private Set<@Valid Product> products;
@Valid
    @OneToOne(cascade = CascadeType.ALL, fetch= FetchType.EAGER)
    private Receipt receipt;
}
