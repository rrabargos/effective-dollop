package com.crocell.vuespringshop.service;

import com.crocell.vuespringshop.model.Purchase;
import com.crocell.vuespringshop.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
  Purchase savePurchase(Purchase purchase);

  List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
