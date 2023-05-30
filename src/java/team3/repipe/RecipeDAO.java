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
                        + "AND password = ? ";
                stm = con.prepareStatement(sql);
                stm.setString(1, userName);
                stm.setString(2, password);

                rs = stm.executeQuery();

                if (rs.next()) {
                    return true;
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

    public AccountDTO checkAccountExist(String userName) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        String query = "SELECT * \n"
                + "FROM account\n"
                + "WHERE userName = ?/n";
        try {
            con = DBUtils.getConnection();
            stm = con.prepareStatement(query);
            stm.setString(1, userName);
            rs = stm.executeQuery();
            while (rs.next()) {
                return new AccountDTO(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getLong(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9));
            }
        } catch (Exception e) {

        }
        return null;
    }

    public int createID() {
        int id = -1; // giá trị mặc định khởi tạo
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        String query = "SELECT MAX(userID) AS maxID FROM account";
        try {
            con = DBUtils.getConnection();
            stm = con.prepareStatement(query);
            rs = stm.executeQuery();
            if (rs.next()) {
                id = rs.getInt("maxID") + 1;
            } else {
                id = 1; // nếu không có bất kỳ tài khoản nào trong bảng, sử dụng userID đầu tiên là 1
            }
        } catch (Exception e) {
            // xử lý ngoại lệ tại đây
        }
        return id;
    }

    public boolean checkID(int userID) {
        boolean check = false;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        String query = "SELECT * \n"
                + "FROM account\n"
                + "WHERE userID = ?/n";
        try {
            con = DBUtils.getConnection();
            stm = con.prepareStatement(query);
            stm.setInt(1, userID);
            rs = stm.executeQuery();
            if (rs.next()) {
                return check;
            } else {
                check = true;

            }
        } catch (Exception e) {

        }
        return check;
    }

    public AccountDTO signUp(int userID, String userName, String password, String fullname, long phone) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        String query = "INSERT INTO account\n"
                + "values(0,?,?,?,?,?,1,0,0)";
        try {
            con = DBUtils.getConnection();
            stm = con.prepareStatement(query);
            stm.setInt(1, userID);
            stm.setString(2, userName);
            stm.setString(3, password);
            stm.setString(4, fullname);
            stm.setLong(5, phone);
            stm.executeUpdate();
        } catch (Exception e) {

        }
        return null;
    }
}
