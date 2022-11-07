package com.example.mymoviesapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mymoviesapp.domain.MoviesRepository

class MoviesViewModelFactory(private val moviesRepository: MoviesRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(MoviesRepository::class.java).newInstance(moviesRepository)
    }
}