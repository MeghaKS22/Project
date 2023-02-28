package com.example.ShoppingCart2.repository;

import com.example.ShoppingCart2.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<Item, Integer> {

}