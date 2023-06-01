/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.recipe;

import java.io.Serializable;
import static java.nio.file.Files.list;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.naming.NamingException;
import team3.util.DBUtils;
import team3.recipe.RecipeOrganizeDTO;

/**
 *
 * @author THIS PC
 */
public class RecipeOrganizeDAO implements Serializable {

    public RecipeOrganizeDTO checkLogin(String userName, String password)
            throws ClassNotFoundException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        RecipeOrganizeDTO result = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "Select * "
                        + "From account "
                        + "Where userName = ? "
                        + "AND password = ? ";

                stm = con.prepareStatement(sql);
                stm.setString(1, userName);
                stm.setString(2, password);

                rs = stm.executeQuery();

                if (rs.next()) {

                    int userID = rs.getInt("userID");
                    String fullName = rs.getString("fullName");
                    String phone = rs.getString("phone");
                    boolean role = rs.getBoolean("role");
                    int status = rs.getInt("status");
                    String token = rs.getString("token");

                    result = new RecipeOrganizeDTO(userID, userName, password, fullName, phone, status, role, token);

                }
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return result;
    }

    /*private List<RecipeOrganizeDTO> recipes;

    public List<RecipeOrganizeDTO> getRecipe() {
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

                    RecipeOrganizeDTO dto = new RecipeOrganizeDTO(recipeID, recipeName, caloRecipe, description, imgUrl, difficulty);

                    if (this.recipes == null) {
                        this.recipes = new ArrayList<>();
                    }
                    this.recipes.add(dto);
                }
            }
        } finally {
            if (rs != null) {
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
*/
   Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<RecipeOrganizeDTO> getAllRecipe(){
        List<RecipeOrganizeDTO> list = new ArrayList<>();
        String query = "SELECT * from recipe";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareCall(query);;
            rs = ps.executeQuery();
        while(rs.next()){
            list.add(new RecipeOrganizeDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7)));
        }
        } catch (Exception e){
        }
        
                return list;
    }

    

    public boolean SignUp(String username, String password, String fullname, String phone, int status, boolean role, String token)
            throws SQLException, NamingException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;

        String query = "INSERT into account(userName, password, fullName, phone, status, role, token)"
                + " Values(?, ?, ?, ?, ?, ?, ?)";
        try {
            con = DBUtils.getConnection();
            stm = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);// phần userID là tăng dần ko cần phải tự tay chèn
            stm.setString(1, username);
            stm.setString(2, password);
            stm.setString(3, fullname);
            stm.setString(4, phone);
            stm.setInt(5, status);
            stm.setBoolean(6, role);
            stm.setString(7, token);
            int row = stm.executeUpdate();
        
            if (row > 0) {
                return true;
            }
        } finally {
            if (stm != null) {
                stm.close();
            }

            if (con != null) {
                con.close();
            }
        }
        return false;

    }
  
    }
        
    



