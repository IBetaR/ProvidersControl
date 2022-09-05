package com.ibetar.providerscontrol.persistence.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "receipt")
public class Receipt implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NotBlank
    @Column(name = "date")
    private String date;

    //@NotBlank
    @Column(name = "number")
    private int number;

    //@NotBlank
    @Column(name = "totalAmount")
    private float totalAmount;


    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "provider_ID")
    private ProductProvider provider;

    @OneToMany(mappedBy = "receipt", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<DetailReceipt> detailReceipts = new ArrayList<DetailReceipt>();

}