package com.example.mymoviesapp.domain
import androidx.lifecycle.LiveData
import  com.example.mymoviesapp.models.Movie

interface MoviesRepository {
    fun getMovies() : LiveData<List<Movie>>
    fun saveMovie(movie: Movie)
}