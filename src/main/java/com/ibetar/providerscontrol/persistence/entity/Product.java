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
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NotBlank
    @Column(name = "name")
    private String name;

    //@NotBlank
    @Column(name = "amount")
    private int amount;

    //@NotBlank
    @Column(name = "price")
    private float price;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name ="product_category",
            joinColumns =@JoinColumn(name = "product_id"),
            inverseJoinColumns =@JoinColumn (name = "category_id"))
    private List<Category> categories = new ArrayList<>();


}
