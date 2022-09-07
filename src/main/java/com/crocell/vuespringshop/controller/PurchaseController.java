package com.crocell.vuespringshop.controller;

import com.crocell.vuespringshop.model.Purchase;
import com.crocell.vuespringshop.security.UserPrincipal;
import com.crocell.vuespringshop.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/purchase")
public class PurchaseController {

  private final PurchaseService purchaseService;

  @PostMapping
  public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase){
    return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<?> getAllPurchaseOfUser (@AuthenticationPrincipal UserPrincipal userPrincipal){
    return ResponseEntity.ok(purchaseService.findPurchaseItemsOfUser(userPrincipal.getId()));
  }
}
