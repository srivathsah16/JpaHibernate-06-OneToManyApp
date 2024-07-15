package com.srivath.otm.entities.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.srivath.otm.dao.CategoryDAO;
import com.srivath.otm.entities.CategoryEntity;

public class CategoryDAOImpl implements CategoryDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveCategory(CategoryEntity category) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		try {
			em.persist(category);
			txn.commit();
			System.out.println("Category and its products persisted into DB...");
		} catch (Exception e) {
			txn.rollback();
			System.out.println("Error in persisting Category and its products into DB...");
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

	@Override
	public CategoryEntity fetchCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		CategoryEntity category = em.find(CategoryEntity.class, categoryId);
		em.close();
		return category;
	}

	@Override
	public void removeCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		CategoryEntity category = em.find(CategoryEntity.class, categoryId);
		txn.begin();
		try {
			em.remove(category);
			txn.commit();
			System.out.println("Category and its products removed from DB...");
		} catch (Exception e) {
			txn.rollback();
			System.out.println("Error in removing Category and its products from DB...");
		} finally {
			em.close();
		}

	}

	@Override
	public void testJpqlJoinQuery() {
		EntityManager em = factory.createEntityManager();
		String jpqlJoinQuery = "SELECT c.categoryName , p.productName FROM CategoryEntity c JOIN c.lstOfProducts p";
		TypedQuery<Object[]> query = em.createQuery(jpqlJoinQuery, Object[].class);
		List<Object[]> list = query.getResultList();
		list.forEach(obj -> {
			System.out.println("CategoryName = " + obj[0] + " , ProductName = " + obj[1]);
		});
		em.close();
	}
}
