package com.pearlpay.medusa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="wallet")
public class WalletEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToMany(
//        mappedBy = "wallet_id",
//        cascade = CascadeType.ALL,
//        orphanRemoval = true,
//        fetch = FetchType.EAGER
//    )
//    @OneToMany(mappedBy = "wallet", cascade = CascadeType.ALL)
//    @JsonIgnore
//    private Set<TransactionEntity> transactionEntitySet;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private Double balance;

    @Column
    private LocalDate birthday;

    // TODO: Convert to Enum
    // TODO: Or pull me out in controller as part of payload
    @Column
    private String transactionType;
}
