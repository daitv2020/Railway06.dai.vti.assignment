package vti.com.vti.TestingSQL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectDB {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resource/database.properties"));
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		Class.forName(properties.getProperty("driver"));
		Connection connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connect thanh cong");

	}

}
