package com.example.mymoviesapp.domain

import com.example.mymoviesapp.models.Movie

class MoviesRepositoryImplement : MoviesRepository {
    override fun getMovies(): List<Movie> {
        return listOf(
            Movie("Black Adam", "Action", "2022", "Jaume Collet-Serra", "https://pics.filmaffinity.com/black_adam-333825779-mmed.jpg")
        )
    }

}