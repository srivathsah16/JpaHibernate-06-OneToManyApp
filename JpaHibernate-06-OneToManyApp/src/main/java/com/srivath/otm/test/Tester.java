package com.srivath.otm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

import com.srivath.otm.dao.CategoryDAO;
import com.srivath.otm.entities.CategoryEntity;
import com.srivath.otm.entities.ProductEntity;
import com.srivath.otm.entities.impl.CategoryDAOImpl;

public class Tester {
	public static void main(String[] args) throws Exception {
		CategoryDAO dao = new CategoryDAOImpl();

		/*
		 * call saveCategory()
		 */

//		// create CategoryEntity instance
//		CategoryEntity category1 = new CategoryEntity();
//		category1.setCategoryId(12221);
//		category1.setCategoryName("Electronics");
//
//		// create ProductEntity instance1
//		ProductEntity product1 = new ProductEntity();
//		product1.setProductId(16567);
//		product1.setProductName("Mobile");
//		File file = new File(
//				"C:\\Users\\SRIVATH\\OneDrive - Capgemini\\Documents\\Courses\\AshokIT\\Images\\mobile1.jpg");
//		byte[] imageBytes = new byte[(int) file.length()];
//		FileInputStream fis = new FileInputStream(file);
//		fis.read(imageBytes);
//		product1.setProductImage(imageBytes);
//
//		// create ProductEntity instance2
//		ProductEntity product2 = new ProductEntity();
//		product2.setProductId(15454);
//		product2.setProductName("Iron");
//		File file2 = new File(
//				"C:\\Users\\SRIVATH\\OneDrive - Capgemini\\Documents\\Courses\\AshokIT\\Images\\Iron.jpg");
//		byte[] imageBytes2 = new byte[(int) file2.length()];
//		FileInputStream fis2 = new FileInputStream(file2);
//		fis2.read(imageBytes2);
//		product2.setProductImage(imageBytes2);
//
//		// create ProductEntity instance3
//		ProductEntity product3 = new ProductEntity();
//		product3.setProductId(24565);
//		product3.setProductName("MicrowaveOven");
//		File file3 = new File(
//				"C:\\Users\\SRIVATH\\OneDrive - Capgemini\\Documents\\Courses\\AshokIT\\Images\\microOven.jpg");
//		byte[] imageBytes3 = new byte[(int) file3.length()];
//		FileInputStream fis3 = new FileInputStream(file3);
//		fis3.read(imageBytes3);
//		product3.setProductImage(imageBytes3);
//
//		// add ProductEntity instances to Collection.
//		List<ProductEntity> lstOfProducts = Arrays.asList(product1, product2, product3);
//		// set the collection CategoryEntity instance
//		category1.setLstOfProducts(lstOfProducts);
//
//		dao.saveCategory(category1);

		/*
		 * call fetchCategory()
		 */
		
//		CategoryEntity cEntity = dao.fetchCategory(12221);
//		System.out.println("Category Name: " + cEntity.getCategoryName());
//		List<ProductEntity> lstOfProductEntities = cEntity.getLstOfProducts();
//		int i = 1;
//		for (ProductEntity pEntity : lstOfProductEntities) {
//			System.out.println(
//					"Product ID: " + pEntity.getProductId() + "\n" + "Product Name:" + pEntity.getProductName());
//			byte[] image_bytes = pEntity.getProductImage();
//			String imageName = "image" + i + ".jpg";
//			String path = "C:\\Users\\SRIVATH\\OneDrive - Capgemini\\Documents\\Courses\\AshokIT\\ImagesFromDB\\"
//					+ imageName;
//			File file = new File(path);
//			FileOutputStream fos = new FileOutputStream(file);
//			fos.write(image_bytes);
//			System.out.println("Check the image of "+pEntity.getProductName()+" at "+file.getAbsolutePath());
//			i++;
//		}
		
		/*
		 * call removeCategory()
		 */
//		dao.removeCategory(12221);
		
		dao.testJpqlJoinQuery();
//
	}
}
