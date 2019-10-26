package com.groupeastek.library.category;

public interface ICategoryService {

    public Category getCategoryByCode(String code);

    public Category saveCategory(Category category);

    public Category updateCategory(Category category);

    public void deleteCategory(Category category);
}
