package com.bank.customer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    // Map JSON "phone" to this field, but persist it as mobile_number in the database.
    @JsonProperty("phone")
    @Column(name = "mobile_number", nullable = false)
    private String mobileNumber;
}
