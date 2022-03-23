package com.crocell.vuespringshop.repository;

import com.crocell.vuespringshop.model.Purchase;
import com.crocell.vuespringshop.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    @Query("SELECT " +
    "d.name as name, d.deviceType as type, p.price as price, p.color as color, p.purchaseTime as purchaseTime " +
    "FROM Purchase p LEFT JOIN Device d on d.id = p.deviceId " +
    "WHERE p.userId = :userId")
    List<PurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId);
}
