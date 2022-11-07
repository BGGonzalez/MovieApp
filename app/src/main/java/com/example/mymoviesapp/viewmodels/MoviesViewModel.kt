package com.example.mymoviesapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mymoviesapp.domain.MoviesRepository
import com.example.mymoviesapp.models.Movie

class MoviesViewModel(private val moviesRepository: MoviesRepository) : ViewModel() {

    private val movies = MutableLiveData<List<Movie>>()

    fun getMovies() : LiveData<List<Movie>>{
        return moviesRepository.getMovies()
    }

}