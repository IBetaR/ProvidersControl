package com.ibetar.providerscontrol.persistence.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "product_provider")
public class ProductProvider implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NotBlank
    //@Size(min = 3 , max = 50)
    @Column(name = "name")
    private String name;

    //@NotBlank
    @Column(name = "cuit", unique = true)
    private String cuit;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address")
    private Address address;

    @OneToMany(mappedBy = "provider")
    private List<Receipt> receipts = new ArrayList<>();
}