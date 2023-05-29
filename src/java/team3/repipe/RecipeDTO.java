/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.repipe;

import java.io.Serializable;

/**
 *
 * @author THIS PC
 */
public class RecipeDTO implements Serializable {
    private String recipeID;
    private String recipeName;
    private String caloRecipe;
    private String description;
    private String imgUrl;
    private String difficulty;

    public RecipeDTO() {
    }

    public RecipeDTO(String recipeID, String recipeName, String caloRecipe, String description, String imgUrl, String difficulty) {
        this.recipeID = recipeID;
        this.recipeName = recipeName;
        this.caloRecipe = caloRecipe;
        this.description = description;
        this.imgUrl = imgUrl;
        this.difficulty = difficulty;
    }

    /**
     * @return the recipeID
     */
    public String getRecipeID() {
        return recipeID;
    }

    /**
     * @param recipeID the recipeID to set
     */
    public void setRecipeID(String recipeID) {
        this.recipeID = recipeID;
    }

    /**
     * @return the recipeName
     */
    public String getRecipeName() {
        return recipeName;
    }

    /**
     * @param recipeName the recipeName to set
     */
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    /**
     * @return the caloRecipe
     */
    public String getCaloRecipe() {
        return caloRecipe;
    }

    /**
     * @param caloRecipe the caloRecipe to set
     */
    public void setCaloRecipe(String caloRecipe) {
        this.caloRecipe = caloRecipe;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the imgUrl
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * @param imgUrl the imgUrl to set
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * @return the difficulty
     */
    public String getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    
}