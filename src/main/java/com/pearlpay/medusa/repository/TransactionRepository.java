package com.pearlpay.medusa.repository;

import com.pearlpay.medusa.entity.TransactionEntity;
import com.pearlpay.medusa.entity.WalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
}
