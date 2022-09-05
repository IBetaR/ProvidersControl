package com.ibetar.providerscontrol.service;

import com.ibetar.providerscontrol.persistence.entity.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CategoryServiceImplTest {

    private CategoryServiceImpl categoryService = new CategoryServiceImpl();

    @BeforeEach
    void setUp(){
        CategoryServiceImpl categoryService = new CategoryServiceImpl();

    }

    @Test
    @DisplayName("Create and save a category")
    void createCategory() {
        Category expected = new Category(1L,"dairy");
        final Category result = categoryService.createCategory(1L,"dairy");

        Assertions.assertEquals(result.getName(), "dairy" );
        Assertions.assertEquals(result.getName(), expected.getName());
        Assertions.assertEquals(expected.toString(), result.toString() );
        System.out.println("this is ToString: " + expected.toString());
        assertInstanceOf(Category.class, result );
    }

    @Test
    @DisplayName("get a category by id")
    void getCategoryById() {
        Category expected = new Category(1L,"dairy");
        categoryService.createCategory(1L,"dairy");
        final Category result = categoryService.getCategory(1L);

        Assertions.assertNotEquals(null, result );
        assertEquals(expected.getId(), result.getId());

    }

    @Test
    void updateCategory() {
        Category expected = new Category(1L,"fruits");
        final Category result = categoryService.updateCategory(1L,"fruits");

        Assertions.assertEquals(expected.getName(), result.getName());
        assertEquals(expected.getId(), result.getId());
    }

    @Test
    void deleteCategoryById() {
        Category expected = new Category(1L,"fruits");
        final Category result = categoryService.deleteCategoryById(1L,"fruits");

        assertEquals(null, result);
        assertNotEquals(expected,result);
    }
}