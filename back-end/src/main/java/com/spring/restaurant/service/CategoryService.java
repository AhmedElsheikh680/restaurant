package com.spring.restaurant.service;


import com.spring.restaurant.dao.CategoryRepo;
import com.spring.restaurant.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public List<Category> categories() {
        return categoryRepo.findAll();
    }
}
