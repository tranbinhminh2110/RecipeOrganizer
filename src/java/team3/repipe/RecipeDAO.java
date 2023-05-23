/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.repipe;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import team3.util.DBUtils;

/**
 *
 * @author THIS PC
 */
public class RecipeDAO implements Serializable {
    public boolean checkLogin(String username, String password)
            throws ClassNotFoundException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "Select username "
                        + "From RecipeOrganize "
                        + "Where username = ? "
                        + "AND password = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, username);
                stm.setString(2, password);
                
                rs = stm.executeQuery();
                
                if (rs.next())
                    return true;
            }

        } finally {
            if(rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return false;
    }
    private List<RecipeDTO> recipes;

    public List<RecipeDTO> getRecipe() {
        return recipes;
    }
    
    public void searchRecipe(String searchValue) 
            throws ClassNotFoundException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "Select  "
                        + "From RecipeOrganize "
                        + "Where lastname Like ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchValue + "%");
                
                rs = stm.executeQuery();
                
                while (rs.next()) {
                    String a = rs.getString("");
                    String b = rs.getString("");
                    String c = rs.getString("");
                    boolean d = rs.getBoolean("");
                    
                    RecipeDTO dto = new RecipeDTO( a, b, c, d);
                    
                    if (this.recipes == null) {
                        this.recipes = new ArrayList<>();
                    }
                    this.recipes.add(dto);
                }
            }
        } finally {
            if(rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        
    }
}

