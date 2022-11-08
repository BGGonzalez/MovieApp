package com.example.mymoviesapp.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mymoviesapp.models.Movie

class MoviesRepositoryImplement : MoviesRepository {

    private val movies = MutableLiveData<List<Movie>>(
        mutableListOf(
            Movie("Black Adam", "Action", "2022", "Jaume Collet-Serra", "https://pics.filmaffinity.com/black_adam-333825779-mmed.jpg")
        )
    )

    override fun getMovies(): LiveData<List<Movie>> {
        return movies
    }

    override fun saveMovie(movie: Movie) {
        /*val data = movie.value?.toMutableList()
        data?.add(movie)
        movies.value = data*/
    }

}