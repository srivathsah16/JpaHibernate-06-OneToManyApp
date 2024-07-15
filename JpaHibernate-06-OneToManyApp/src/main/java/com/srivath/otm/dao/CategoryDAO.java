package com.srivath.otm.dao;

import com.srivath.otm.entities.CategoryEntity;

public interface CategoryDAO {
	void saveCategory(CategoryEntity category);

	CategoryEntity fetchCategory(Integer categoryId);

	void removeCategory(Integer categoryId);
	
	void testJpqlJoinQuery();
}
