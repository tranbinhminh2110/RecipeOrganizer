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
    public boolean checkLogin(String userName, String password)
            throws ClassNotFoundException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "Select userName, password "
                        + "From account "
                        + "Where userName = ? "
                        + "AND password = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, userName);
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
                        + "From recipe "
                        + "Where lastname Like ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchValue + "%");
                
                rs = stm.executeQuery();
                
                while (rs.next()) {
                    String recipeID = rs.getString("recipeID");
                    String recipeName = rs.getString("recipeName");
                    String caloRecipe = rs.getString("caloRecipe");
                    String description = rs.getString("description");
                    String imgUrl = rs.getString("imgUrl");
                    String difficulty = rs.getString("difficulty");
                    
                    RecipeDTO dto = new RecipeDTO(recipeID, recipeName, caloRecipe, description, imgUrl, difficulty);
                    
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
    
    private List<RecipeDTO> recipeAll;

    public List<RecipeDTO> getRecipeAll() {
        return recipeAll;
    }
    public void searchAll()
            throws ClassNotFoundException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "Select * "
                        + "From recipe ";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                
                while (rs.next()) {
                    String recipeID = rs.getString("recipeID");
                    String recipeName = rs.getString("recipeName");
                    String caloRecipe = rs.getString("caloRecipe");
                    String description = rs.getString("description");
                    String imgUrl = rs.getString("imgUrl");
                    String difficulty = rs.getString("difficulty");
                    
                    RecipeDTO dto = new RecipeDTO(recipeID, recipeName, caloRecipe, description, imgUrl, difficulty);
                    
                    if (this.recipeAll == null) {
                        this.recipeAll = new ArrayList<>();
                    }
                    this.recipeAll.add(dto);
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

