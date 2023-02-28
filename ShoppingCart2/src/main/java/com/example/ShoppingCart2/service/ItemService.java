package com.example.ShoppingCart2.service;

import com.example.ShoppingCart2.item.Item;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ItemService {

    Item addItem(Item item);



    Item getItemById(Integer id) throws ItemNotFoundException;

    default List<Item> getItems() {
        return null;
    }

    Item updateItem(Integer itemId, Item item) throws ItemNotFoundException;
}
