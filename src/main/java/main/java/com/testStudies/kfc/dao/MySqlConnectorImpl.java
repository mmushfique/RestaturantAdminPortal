package main.java.com.testStudies.kfc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectorImpl implements DbConnector {

	@Override
	public Connection getDbConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver.class");
		String databaseURL="jdbc:mysql://127.0.0.1:3306/kfc";
		String user="root";
		String password="";
		
		Connection connection=DriverManager.getConnection(databaseURL,user,password);
		return connection;
	}

}
