package com.example.mymoviesapp.domain
import  com.example.mymoviesapp.models.Movie

interface MoviesRepository {
    fun getMovies() : List<Movie>
}