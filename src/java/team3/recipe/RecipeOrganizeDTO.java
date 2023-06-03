/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.recipe;

import java.io.Serializable;

/**
 *
 * @author THIS PC
 */
public class RecipeOrganizeDTO implements Serializable {
    // khởi tạo biến cho accounts
    
    private int userID;
    private String userName;
    private String password;
    private String fullName;
    private String phone;
    private int status;
    private boolean role;
    private String token;
    private String email;
    
    // khởi tạo biến cho good's recipe
    private int recipeID;
    private String recipeName;
    private String caloRecipe;
    private String description;
    private String imgUrl;
    private int avgRating;
    private String difficulty;

    // khởi tạo hàm khởi tạo ko tham số
    public RecipeOrganizeDTO() {
    }

    // hàm khởi tạo để get token từ email 
    public RecipeOrganizeDTO(int userID, String token, String email) {
        this.userID = userID;
        this.token = token;
        this.email = email;
    }

    
    
    // khởi tạo hàm khởi tạo accounts
    public RecipeOrganizeDTO(int userID, String userName, String password, String fullName, String phone, int status, boolean role, String token, String email) {
     
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.status = status;
        this.role = role;
        this.token = token;
        this.email = email;
    }

    public RecipeOrganizeDTO(int recipeID, String recipeName, String caloRecipe, String description, String imgUrl, int avgRating, String difficulty) {
        this.recipeID = recipeID;
        this.recipeName = recipeName;
        this.caloRecipe = caloRecipe;
        this.description = description;
        this.imgUrl = imgUrl;
        this.avgRating = avgRating;
        this.difficulty = difficulty;
    }

    

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean getRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getCaloRecipe() {
        return caloRecipe;
    }

    public void setCaloRecipe(String caloRecipe) {
        this.caloRecipe = caloRecipe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(int avgRating) {
        this.avgRating = avgRating;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    

}