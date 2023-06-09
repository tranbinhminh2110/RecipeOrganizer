/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.DTO;

/**
 *
 * @author AS
 */
public class RecipeDTO {
    private int recipeID;
    private String recipeName;
    private String caloRecipe;
    private String description;
    private String imgUrl;
    private int avgRating;
    private String difficulty;

    public RecipeDTO() {
    }
    //Contructor cua category
    

    public RecipeDTO(int recipeID, String recipeName, String caloRecipe, String description, String imgUrl, int avgRating, String difficulty) {
        this.recipeID = recipeID;
        this.recipeName = recipeName;
        this.caloRecipe = caloRecipe;
        this.description = description;
        this.imgUrl = imgUrl;
        this.avgRating = avgRating;
        this.difficulty = difficulty;
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

    @Override
    public String toString() {
        return "DTO{" + "recipeID=" + recipeID + ", recipeName=" + recipeName + ", caloRecipe=" + caloRecipe + ", description=" + description + ", imgUrl=" + imgUrl + ", avgRating=" + avgRating + ", difficulty=" + difficulty + '}';
    }
    
    
}
