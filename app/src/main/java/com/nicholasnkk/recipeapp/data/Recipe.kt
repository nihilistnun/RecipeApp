package com.nicholasnkk.recipeapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipes")
data class Recipe(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo
    var name: String = ""

)