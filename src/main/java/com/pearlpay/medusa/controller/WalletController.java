package com.pearlpay.medusa.controller;

import com.pearlpay.medusa.entity.WalletEntity;
import com.pearlpay.medusa.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "wallets")
public class WalletController {
    @Autowired
    private WalletService walletService;

    @PostMapping(path = "")
    @ResponseStatus(HttpStatus.CREATED)
    public WalletEntity save(@RequestBody WalletEntity walletEntity) {
        return walletService.save(walletEntity);
    }

    @GetMapping(path = "")
    @ResponseStatus(HttpStatus.FOUND)
    public List<WalletEntity> findAll() {
        return walletService.findAll();
    }

    @DeleteMapping(path = "")
    @ResponseStatus(HttpStatus.OK)
    public WalletEntity delete(@RequestBody WalletEntity walletEntity) {
        System.out.println("Wallet Entity" + walletEntity);
        return walletService.delete(walletEntity);
    }

    // TODO: Implement with list of Transactions
//    @GetMapping(path = "/{id}")
//    @ResponseStatus(HttpStatus.FOUND)
//    public WalletEntity get(@PathVariable String id) {
//        return walletService.get(Long.valueOf(id));
//    }
}
