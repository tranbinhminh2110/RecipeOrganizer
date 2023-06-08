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
                    String email = rs.getString("email");
                    result = new RecipeOrganizeDTO(userID, userName, password, fullName, phone, status, role, token, email);

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

    public List<RecipeOrganizeDTO> searchRecipe(String txtSearch) throws ClassNotFoundException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<RecipeOrganizeDTO> list = new ArrayList<>();
        try {
            String query = "SELECT *\n"
                    + "FROM recipe\n"
                    + "WHERE  recipeName like ?  ";
            con = DBUtils.getConnection();
            stm = con.prepareStatement(query);
            stm.setString(1, "%" + txtSearch + "%");
            rs = stm.executeQuery();
            while (rs.next()) {
                RecipeOrganizeDTO o = new RecipeOrganizeDTO(
                         rs.getInt(1),
                         rs.getString(2),
                         rs.getString(3),
                         rs.getString(4),
                         rs.getString(5),
                         rs.getInt(6),
                         rs.getString(7)
                );
                list.add(o);
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
        return list;
    }
    public List<RecipeOrganizeDTO> getAllRecipe() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<RecipeOrganizeDTO> list = new ArrayList<>();
        String query = "SELECT * from recipe";
        try {
            conn = new DBUtils().getConnection();
            ps = conn.prepareCall(query);;
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new RecipeOrganizeDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7)));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public boolean SignUp(String username, String password, String fullname, String phone, int status, boolean role, String token, String email)
            throws SQLException, NamingException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;

        String query = "INSERT into account(userName, password, fullName, phone, status, role, token, email)"
                + " Values(?, ?, ?, ?, ?, ?, ?, ?)";
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
            stm.setString(8, email);
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

    public List<String> getEmailToCheck(String email) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<String> list = new ArrayList<>();
        String query = "Select email "
                + "From account "
                + "Where email = ? ";

        try {
            con = new DBUtils().getConnection();
            stm = con.prepareStatement(query);
            stm.setString(1, email);
            rs = stm.executeQuery();

            while (rs.next()) {

                list.add(rs.getString("email"));
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
        return list;
    }

    public RecipeOrganizeDTO getTokenToResetPassword(String email) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        RecipeOrganizeDTO result = null;
        String query = "Select userID, token, email "
                + "From account "
                + "Where email = ? ";

        try {
            con = new DBUtils().getConnection();
            stm = con.prepareStatement(query);
            stm.setString(1, email);
            rs = stm.executeQuery();

            if (rs.next()) {
                int userID = rs.getInt("userID");
                String token = rs.getString("token");
                result = new RecipeOrganizeDTO(userID, token, email);
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

    public boolean resetPassword(String password, String email, String token) throws ClassNotFoundException, SQLException {

        Connection con = null;
        PreparedStatement stm = null;

        try {

            con = new DBUtils().getConnection();
            if (con != null) {
                String query = "UPDATE account "
                        + "SET password = ? "
                        + "WHERE email = ?";
                stm = con.prepareStatement(query);
                stm.setString(1, password);
                stm.setString(2, email);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
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

    public RecipeOrganizeDTO loginByGmail(String email)
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
                        + "Where email = ? ";

                stm = con.prepareStatement(sql);
                stm.setString(1, email);

                rs = stm.executeQuery();

                if (rs.next()) {

                    int userID = rs.getInt("userID");
                    String userName = rs.getString("userName");
                    String password = rs.getString("password");
                    String fullName = rs.getString("fullName");
                    String phone = rs.getString("phone");
                    boolean role = rs.getBoolean("role");
                    int status = rs.getInt("status");
                    String token = rs.getString("token");
                    result = new RecipeOrganizeDTO(userID, userName, password, fullName, phone, status, role, token, email);

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

    public static void changePassword(String username, String newPassword) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement stm = null;

        try {
            con = DBUtils.getConnection();
            String sql = "UPDATE account SET password = ? WHERE userName = ?";
            stm = con.prepareStatement(sql);
            stm.setString(1, newPassword);
            stm.setString(2, username);
            stm.executeUpdate();
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
    
    public ArrayList<RecipeOrganizeDTO> getAllCategories() throws ClassNotFoundException, SQLException {
        ArrayList<RecipeOrganizeDTO> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "SELECT categoryID, categoryName\n"
                        + "FROM category";
                 stm = con.prepareStatement(sql);
                 rs = stm.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int categoryID = rs.getInt(1);
                        String categoryName = rs.getString(2);
                        RecipeOrganizeDTO o = new RecipeOrganizeDTO(categoryID, categoryName);
                        list.add(o);
                    }
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
        return list;
    }
    
    public List<RecipeOrganizeDTO> getRecipeByCategory(String categoryID) throws ClassNotFoundException, SQLException {
        List<RecipeOrganizeDTO> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            String query = "SELECT r.* FROM recipe r JOIN category c ON r.recipeID = c.recipeID WHERE c.categoryID = ?";
            con = new DBUtils().getConnection();
            stm = con.prepareCall(query);
            stm.setString(1, categoryID);
            rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new RecipeOrganizeDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7)));
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
        }       return list;
    }
    public static boolean searchAccount(String fullName, String phone, String email )
            throws ClassNotFoundException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "Select * "
                        + "From account "
                        + "Where fullName = ? or phone = ? or email = ? ";
                stm = con.prepareStatement(sql);
                stm.setString(1,fullName);
                stm.setString(2,phone);
                stm.setString(3,email);

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
    
//        public static RecipeOrganizeDTO searchAccount(String fullName, String phone, String email)
//            throws ClassNotFoundException, SQLException {
//        RecipeOrganizeDTO result = null;
//        Connection con = null;
//        PreparedStatement stm = null;
//        ResultSet rs = null;
//
//        try {
//            con = DBUtils.getConnection();
//            if (con != null) {
//                String sql = "Select * "
//                        + "From account "
//                        + "Where fullName = ? or phone = ? or email = ? ";
//                stm = con.prepareStatement(sql);
//                stm.setString(1, fullName);
//                stm.setString(2, phone);
//                stm.setString(3, email);
//
//                rs = stm.executeQuery();
//
//                if (rs.next()) {
//                    result = new RecipeOrganizeDTO(fullName, phone, email);
//                }
//            }
//
//        } finally {
//            if (rs != null) {
//                rs.close();
//            }
//            if (stm != null) {
//                stm.close();
//            }
//            if (con != null) {
//                con.close();
//            }
//        }
//
//        return result;
//    }

    public static boolean updateProfileAccount(String userName, String fullName, String phone, String email) 
            throws ClassNotFoundException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "UPDATE  account "
                        + "SET fullName = ? , phone = ? , email = ? "
                        + "WHERE userName = ?";
                stm = con.prepareStatement(sql);
                stm.setString(4, userName);
                stm.setString(1, fullName);
                stm.setString(2, phone);
                stm.setString(3, email);
                
                int rs = stm.executeUpdate();
                if (rs > 0) {
                    return true;
                }
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

    public RecipeOrganizeDTO getProfile(String userName) throws ClassNotFoundException, SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        RecipeOrganizeDTO result = null;

        try {
            con = DBUtils.getConnection();
            if (con != null) {
                String sql = "SELECT * FROM account WHERE userName = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, userName);
                rs = stm.executeQuery();

                if (rs.next()) {
                    int userID = rs.getInt("userID");
                    String password = rs.getString("password");
                    String fullName = rs.getString("fullName");
                    String phone = rs.getString("phone");
                    boolean role = rs.getBoolean("role");
                    int status = rs.getInt("status");
                    String token = rs.getString("token");
                    String email = rs.getString("email");
                    result = new RecipeOrganizeDTO(userID, userName, password, fullName, phone, status, role, token, email);
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
}
    

