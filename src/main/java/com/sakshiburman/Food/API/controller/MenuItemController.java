package com.sakshiburman.Food.API.controller;
import com.sakshiburman.Food.API.Entity.MenuItem;
import com.sakshiburman.Food.API.Repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuItemController {

    @Autowired
    private MenuItemRepository menuItemRepository;

    @PostMapping("/create")
    public MenuItem createMenuItem(@RequestBody MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    @GetMapping("/all")
    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }
}
