package main.java.com.testStudies.kfc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.com.testStudies.kfc.model.Product;

public class ProductManager {

	public DbConnector getDbConnector() {
		DbConnectorFactory factory=new MySqlDbConnectorFactoryImpl();
		return factory.getDbConnector();
	}
	public boolean addProduct(Product product) throws ClassNotFoundException, SQLException {
		DbConnector connector=getDbConnector();
		Connection connection=connector.getDbConnection();
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
