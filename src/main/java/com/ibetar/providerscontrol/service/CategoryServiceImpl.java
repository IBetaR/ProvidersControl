package com.ibetar.providerscontrol.service;

import com.ibetar.providerscontrol.persistence.entity.Category;
import com.ibetar.providerscontrol.persistence.entity.Product;

import java.util.HashMap;
import java.util.List;

public class CategoryServiceImpl implements CategoryService{

    private HashMap<Long, Category> categories = new HashMap<>();

    public Category createCategory(Long id, String name){
         categories.put(id, new Category(id, name));
         return categories.get(id);
    }

    public Category getCategory(Long id) {
         return categories.get(id);
    }

    public Category updateCategory(Long id, String name){
         categories.put(id, new Category(id, name));
         return categories.get(id);
    }

    public Category deleteCategoryById (Long id, String category){
        return categories.remove(id);
    }

}
