package main.java.com.testStudies.kfc.service;

import java.util.ArrayList;
import java.util.List;

import main.java.com.testStudies.kfc.model.Product;

public class ProductService {

	private static ProductService serviceObj;
	
	private ProductService() {
	
	}
	
	private static synchronized ProductService getProductServiceInstance() {
		if(serviceObj==null) {
			serviceObj=new ProductService();
		}
		
		return serviceObj;
	}
	
	//Services-----------------
	public boolean registerProduct(Product product) {
		return false;
	}
	
	public Product getSpecificProduct(int productCode) {
		return new Product();
	}
	
	public List<Product> getAllProducts() {
		return new ArrayList<Product>();
	}
	
	public boolean updateProduct(Product product) {
		return false;
	}
	
	public boolean deleteProduct(int productCode) {
		return false;
	}
	
}
