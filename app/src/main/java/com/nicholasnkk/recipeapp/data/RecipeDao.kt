package com.nicholasnkk.recipeapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RecipeDao {
    @Query("SELECT * FROM recipes")
    fun getAll(): List<Recipe>

    @Insert
    fun insert(item: Recipe)
}