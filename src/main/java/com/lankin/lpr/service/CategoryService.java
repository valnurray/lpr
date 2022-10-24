package com.lankin.lpr.service;

import com.lankin.lpr.model.Category;
import java.util.List;

public interface CategoryService {
    Category addCategory(Category category);
    List<Category> getAllCategory();
    Category getCategoryById(long id);
    Category updateCategory(Category category, long id);
    void deleteCategory(long id);
}
