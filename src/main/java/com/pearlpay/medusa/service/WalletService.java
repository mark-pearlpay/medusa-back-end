package com.pearlpay.medusa.service;

import com.pearlpay.medusa.entity.TransactionEntity;
import com.pearlpay.medusa.entity.WalletEntity;
import com.pearlpay.medusa.repository.TransactionRepository;
import com.pearlpay.medusa.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.net.www.MimeTable;

import java.util.List;


@Service
public class WalletService {

    @Autowired
    private WalletRepository walletRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    public WalletEntity save(WalletEntity walletEntity) {
        WalletEntity savedWalletEntity = walletRepository.save(walletEntity);

//        if(null != walletEntity.getTransactionType()) {
//            TransactionEntity transactionEntity = new TransactionEntity();
////            transactionEntity.setWallet(savedWalletEntity);
//            transactionEntity.setTransactionType(walletEntity.getTransactionType());
//
//            transactionRepository.save(transactionEntity);
//        }

        return savedWalletEntity;
    }

    public List<WalletEntity> findAll() {
        return walletRepository.findAll();
    }

    public WalletEntity delete(WalletEntity walletEntity) {
        try {
            walletRepository.delete(walletEntity);
        } catch (Exception e) {
            throw e;
        }

        return walletEntity;
    }

    public WalletEntity get(Long id) {
        return walletRepository.findById(id).orElse(null);
    }
}
