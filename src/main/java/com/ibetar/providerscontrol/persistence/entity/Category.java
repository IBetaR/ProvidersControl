package com.ibetar.providerscontrol.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@NotBlank
    @Column(name = "name")
    private String name;

//    @ManyToMany(mappedBy = "categories")
//    private List<Product> products = new ArrayList<Product>();
}
