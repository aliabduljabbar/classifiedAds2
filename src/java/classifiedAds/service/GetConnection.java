/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classifiedAds.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ali
 */
public class GetConnection {
    public static Connection conn;
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/classifiedAds";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mavericks";
    
    
    static {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
          } catch (SQLException | ClassNotFoundException ex) {
        }   
    }
    
    public static Connection connection(){
	return conn;
    }


}
