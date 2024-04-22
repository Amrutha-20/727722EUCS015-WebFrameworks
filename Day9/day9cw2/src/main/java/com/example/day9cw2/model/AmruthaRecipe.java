package com.example.day9cw2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AmruthaRecipe {
    @Id
    private int recipeId;
    private String title;
    private int ingredients;
    private String instruction;
    private String recipeName;
   
    public AmruthaRecipe(int recipeId, String title, int ingredients, String instruction, String recipeName) {
        this.recipeId = recipeId;
        this.title = title;
        this.ingredients = ingredients;
        this.instruction = instruction;
        this.recipeName = recipeName;
    }

    public AmruthaRecipe(){}

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIngredients() {
        return ingredients;
    }

    public void setIngredients(int ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

}
