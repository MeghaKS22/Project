package com.example.ShoppingCart2.controller;

import com.example.ShoppingCart2.item.Item;
import com.example.ShoppingCart2.service.ItemNotFoundException;
import com.example.ShoppingCart2.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1")
public class ItemController {
@Autowired
ItemService itemService;
    @PostMapping("/item")
    public ResponseEntity<Object> createItem(@RequestBody Item item) {
        return new ResponseEntity<>(itemService.addItem(item), HttpStatus.CREATED);
    }

    @GetMapping("/item/{id}")
    public ResponseEntity<Item> getItem(@PathVariable("id") Integer itemId) throws ItemNotFoundException {
        return ResponseEntity.ok(itemService.getItemById(itemId));
    }

    @GetMapping("/item")
    public List<Item> getItems() {
        return itemService.getItems();
    }

    @PutMapping("/item/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable("id") Integer itemId, @Valid @RequestBody Item item) throws ItemNotFoundException {
        return ResponseEntity.ok(itemService.updateItem(itemId, item));
    }

}

