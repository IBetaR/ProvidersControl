package com.ibetar.providerscontrol.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "detail_receipt")
public class DetailReceipt implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NotBlank
    @Column(name = "amount")
    private int amount;

    //@NotBlank
    @Column(name = "subtotal")
    private float subtotal;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_product")
    private Product product;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "receipt_ID")
    private Receipt receipt;
}
