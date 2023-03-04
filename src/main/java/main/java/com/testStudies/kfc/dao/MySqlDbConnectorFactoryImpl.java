package main.java.com.testStudies.kfc.dao;

public class MySqlDbConnectorFactoryImpl implements DbConnectorFactory {

	@Override
	public DbConnector getDbConnector() {

		return new MySqlConnectorImpl();
	}

}
