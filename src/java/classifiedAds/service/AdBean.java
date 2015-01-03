package classifiedAds.service;

import classifiedAds.model.Ad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ali
 */
public class AdBean {
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/classifiedAds";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mavericks";
    
    
    public void addNew(Ad ad) {
        
        
        try (Connection con = GetConnection.connection()) {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO `ad` (`id`, `title`, `user_id`, `description`, `price`, `loc_id`, `active`, `cat_id`)\n" +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?);");
            
            pstmt.setInt(1, ad.getId());
            pstmt.setString(2, ad.getTitle());
            pstmt.setInt(3, ad.getUser_id());
            pstmt.setString(4, ad.getDescription());
            pstmt.setDouble(5, ad.getPrice());
            pstmt.setNull(6, java.sql.Types.NULL);
            pstmt.setInt(7, ad.getActive());
            pstmt.setInt(8, ad.getCat_id());
            pstmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AdBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(int id) {
        
            
            Ad ad = this.getAd(id);
            ad.setActive(0);
            this.update(ad);
            //stmt.execute("DELETE FROM ad WHERE id=" + String.valueOf(id));
    }
    
    public void update(Ad ad) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            pstmt = con.prepareStatement("UPDATE ad SET title=?, user_id=?, description=?, price=?, loc_id=?, active=?, cat_id=? WHERE id=?");
            
            pstmt.setString(1, ad.getTitle());
            pstmt.setInt(2, ad.getUser_id());
            pstmt.setString(3, ad.getDescription());
            pstmt.setDouble(4, ad.getPrice());
            pstmt.setNull(5, java.sql.Types.NULL);
            pstmt.setInt(6, ad.getActive());
            pstmt.setInt(7, ad.getCat_id());
            pstmt.setInt(8, ad.getId());
            
            pstmt.executeUpdate();
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
    
    public Ad getAd(int id) {
        Ad ad = null;
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ad WHERE id=" + id + " AND active=1");
            if (rs.next()) {
                ad = new Ad();
                ad.setId(rs.getInt(1));
                ad.setTitle(rs.getString(2));
                ad.setUser_id(rs.getInt(3));
                ad.setDescription(rs.getString(4));
                ad.setPrice(rs.getDouble(5));
                //ad.setLoc_id(rs.getInt(6));
                ad.setActive(rs.getInt(7));
                ad.setCat_id(rs.getInt(8));

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
        return ad;
    }
    
    
    public List<Ad> getAds() {
        List<Ad> list = new ArrayList<>();
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ad WHERE active=1 ORDER BY id");
            while (rs.next()) {
                Ad ad = new Ad();
                ad.setId(rs.getInt(1));
                ad.setTitle(rs.getString(2));
                ad.setUser_id(rs.getInt(3));
                ad.setDescription(rs.getString(4));
                ad.setPrice(rs.getDouble(5));
                //ad.setLoc_id(rs.getInt(6));
                ad.setActive(rs.getInt(7));
                ad.setCat_id(rs.getInt(8));
                list.add(ad);
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
                
            }
        }
        return list;
    }
    
    
}
