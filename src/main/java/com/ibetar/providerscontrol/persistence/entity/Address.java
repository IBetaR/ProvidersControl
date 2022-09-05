package com.ibetar.providerscontrol.persistence.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "address")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotBlank
//    @Size(min = 3 , max = 50)
    @Column(name = "nombre_calle")
    private String nombreCalle;

//    @NotBlank
    @Column(name = "number")
    private int number;

    @OneToOne(mappedBy = "address")
    @JoinColumn(name = "fk_provider")
    private ProductProvider provider;
}
