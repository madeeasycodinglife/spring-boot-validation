package com.madeeasy.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.madeeasy.validation.Country;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "address")
@JsonIgnoreProperties({"customer"})
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private Long id;

    @Country
    private String country;
    @Positive
    private Integer pinCode;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    @Valid
    private Customer customer;

}
