/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classifiedAds.service;

import classifiedAds.model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ali
 */
public class UserBean {
    
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/classifiedAds";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mavericks";
    
    
    public int verify(User user) {
        Boolean verified = false;
        int id=-1;
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            pstmt = con.prepareStatement("select * from user WHERE email=? AND password=?");
            pstmt.setString(1, user.getEmail());
            pstmt.setString(2, user.getPassword());
            ResultSet rs = pstmt.executeQuery();
            verified = rs.next();
            id =rs.getInt(1);
        } catch (SQLException | ClassNotFoundException ex) {
            
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(verified)
            return id;
        else 
            return -1;
    }   
    
    
    
    public void registerUser(User user) {
        
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            pstmt = con.prepareStatement("INSERT INTO `user` (`id`, `email`, `password`, `name`, `loc_id`, `phone`)\n" +
"VALUES\n" +
"	(?, ?, ?, ?, ?, ?);");
            pstmt.setInt(1, user.getId());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getName());
            pstmt.setNull(5, java.sql.Types.NULL);
            pstmt.setString(6, user.getPhone());
            
            pstmt.execute();
            
        } catch (SQLException | ClassNotFoundException ex) {
            
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public User getUser(int id ) {
        User user = null;
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE id=" + id);
            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt(1));
                user.setEmail(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setName(rs.getString(4));
                user.setPhone(rs.getString(6));   
            }
        } catch (SQLException | ClassNotFoundException ex) {
 
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return user;
    }
    
}
