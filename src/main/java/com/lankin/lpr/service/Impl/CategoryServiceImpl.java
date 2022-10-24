package com.lankin.lpr.service.Impl;

import com.lankin.lpr.exception.ResourceNotFoundException;
import com.lankin.lpr.model.Category;
import com.lankin.lpr.model.Content;
import com.lankin.lpr.repository.CategoryRepository;
import com.lankin.lpr.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(long id) {
        return categoryRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Category", "Id", id));
    }

    @Override
    public Category updateCategory(Category category, long id) {
        Category existingCategory = categoryRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Category", "Id", id));

        existingCategory.setTitle(category.getTitle());
        existingCategory.setDescription(category.getDescription());
        categoryRepository.save(existingCategory);
        return existingCategory;
    }

    @Override
    public void deleteCategory(long id) {
        categoryRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Content", "Id", id));
        categoryRepository.deleteById(id);
    }
}
