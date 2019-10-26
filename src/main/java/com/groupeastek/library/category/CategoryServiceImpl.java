package com.groupeastek.library.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements ICategoryService{

    @Autowired
    private ICategoryDao categoryDao;

    @Override
    public Category getCategoryByCode(String code) {
        return this.categoryDao.getCategoryByCode(code);
    }

    @Override
    public Category saveCategory(Category category) {
        return this.categoryDao.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return this.categoryDao.save(category);
    }

    @Override
    public void deleteCategory(Category category) {
        this.categoryDao.delete(category);
    }
}
