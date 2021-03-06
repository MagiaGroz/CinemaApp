package com.example.cinema.api.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "favourite_movie_table")
data class FavouriteMovies (
    @PrimaryKey
    @SerializedName("id")
    val id: Int,
    @SerializedName("vote_count")
    val voteCount: Int? = null,
    @SerializedName("poster_path")
    val posterPath: String? = null,
    @SerializedName("original_title")
    val originalTitle: String? = null,
    @SerializedName("overview")
    val overview: String? = null,
    @SerializedName("release_date")
    val releaseDate: String? = null,
    var favorite: Boolean? = null
)