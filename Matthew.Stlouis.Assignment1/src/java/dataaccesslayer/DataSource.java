/* File: DataSource.java
 * Author: Stanley Pieda
 * Date: 2015
 * Modified: 2022 - George Kriger, 2023 - Matthew St. Louis
 * Description: Database connection initializer. Only one connection allowed to prevent memory leaks.
 * References:
 * Ram N. (2013).  Data Access Object Design Pattern or DAO Pattern [blog] Retrieved from
 * http://ramj2ee.blogspot.in/2013/08/data-access-object-design-pattern-or.html
 */
package dataaccesslayer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {
	private Connection connection = null;
	/**
         * Default Constructor*/
	public DataSource(){}
        /**
         * Method used to instantiate a connection to the database. Only one connection allowed
         * to prevent memory leaks. 
         * @return connection - a successful or unsuccessful Connection object.
         */
	public Connection createConnection(){
            // added use of Properties and try-with-resources - kriger
            Properties props = new Properties();

		try (InputStream in = Files.newInputStream(Paths.get("src/main/database.properties"));) {
			props.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}

	    String url = props.getProperty("jdbc.url");
	    String username = props.getProperty("jdbc.username");
	    String password = props.getProperty("jdbc.password");
		try {
			if(connection != null){
				System.out.println("Cannot create new connection, one exists already");
			}
			else{
				connection = DriverManager.getConnection(url, username, password);
			}
		}
		catch(SQLException ex){
                    ex.printStackTrace();
		}
		return connection;
	}
}
