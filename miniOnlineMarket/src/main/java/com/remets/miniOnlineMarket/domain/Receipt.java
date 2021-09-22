package com.remets.miniOnlineMarket.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import java.util.Date;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @NotBlank
    private String productName;
    private int quantity;
    private double totalPrice;
    @NotEmpty
    @NotBlank
    private String sellerName;

    @PastOrPresent
    private Date date;

    @Valid
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name ="buyer_id")
    private Buyer buyer;

}
