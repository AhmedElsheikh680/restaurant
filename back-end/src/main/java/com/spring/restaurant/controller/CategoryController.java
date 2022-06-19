package com.spring.restaurant.controller;


import com.spring.restaurant.model.Category;
import com.spring.restaurant.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

//    http://localhost:8080/api/v1/categories
    @GetMapping("/categories")
    public List<Category> categories() {
        return categoryService.categories();
    }
}
