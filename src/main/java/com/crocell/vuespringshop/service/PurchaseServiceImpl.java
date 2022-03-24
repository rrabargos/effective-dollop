package com.crocell.vuespringshop.service;

import com.crocell.vuespringshop.model.Purchase;
import com.crocell.vuespringshop.repository.PurchaseRepository;
import com.crocell.vuespringshop.repository.projection.PurchaseItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseServiceImpl implements PurchaseService{

  private final PurchaseRepository purchaseRepository;

  @Override
  public Purchase savePuchase(Purchase purchase){
    purchase.setPurchaseTime(LocalDateTime.now());

    return purchaseRepository.save(purchase);
  }

  @Override
  public List<PurchaseItem> findPurchaseItemsOfUser(Long userId){
    return purchaseRepository.findAllPurchasesOfUser(userId);
  }
}
