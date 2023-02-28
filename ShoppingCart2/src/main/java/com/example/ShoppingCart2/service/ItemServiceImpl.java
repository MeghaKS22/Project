package com.example.ShoppingCart2.service;

import com.example.ShoppingCart2.item.Item;
import com.example.ShoppingCart2.repository.ItemRepo;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@CommonsLog
public class ItemServiceImpl implements ItemService  {
    @Autowired
    ItemRepo itemRepo;
    @Override
    public Item addItem(Item item) {
        return itemRepo.save(item);
    }
    @Override
    public Item getItemById(Integer itemId) {
        return itemRepo.findById(itemId).orElseThrow(
        );
    }

    @Override
    public List<Item> getItems() {
        return itemRepo.findAll();
    }

    @Override
    public Item updateItem(Integer itemId, Item item) {
        Item item1 = itemRepo.findById(itemId).orElseThrow(
        );
        item1.setName(Objects.isNull(item.getName()) ? item1.getName() : item.getName());
        item1.setQuantity(Objects.isNull(item.getQuantity()) ? item1.getQuantity() : item.getQuantity());
        item1.setPrice(Objects.isNull(item.getPrice()) ? item1.getPrice() : item.getPrice());
//        System.out.println("Hello-------------");
//        String a = null;
//        a.toString().toCharArray();
        log.debug("Hello----------------------");
        return itemRepo.save(item1);
    }

}
