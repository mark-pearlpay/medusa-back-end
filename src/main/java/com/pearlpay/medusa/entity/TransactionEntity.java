package com.pearlpay.medusa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="transaction")
public class TransactionEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

////    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="wallet_id", nullable=false)
//    @ManyToOne
////    @JoinColumn
//    private WalletEntity wallet;

    @Column
    private String transactionType;

//    // TODO: Move me to superclass
//    @CreatedDate
//    @Column(name = "created_date", updatable = false)
//    @JsonIgnore
//    private Instant createdDate = Instant.now();
//
//    // TODO: Move me to superclass
//    @LastModifiedDate
//    @Column(name = "last_modified_date")
//    @JsonIgnore
//    private Instant lastModifiedDate = Instant.now();
}
