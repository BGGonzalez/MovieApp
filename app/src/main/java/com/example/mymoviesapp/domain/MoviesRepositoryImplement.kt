package com.example.mymoviesapp.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mymoviesapp.models.Movie

class MoviesRepositoryImplement : MoviesRepository {

    private val movies = MutableLiveData<List<Movie>>(
        mutableListOf(
            Movie("Black Adam", "Action", "2022", "Jaume Collet-Serra", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/pFlaoHTZeyNkG83vxsAJiGzfSsa.jpg"),
            Movie("The Godfather", "Drama", "1972", "Francis Ford Coppola", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/3bhkrj58Vtu7enYsRolD1fZdja1.jpg"),
            Movie("Pulp Fiction", "Thriller", "1994", "Quentin Tarantino", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/yAaf4ybTENKPicqzsAoW6Emxrag.jpg"),
            Movie("Forrest Gump", "Comedy & Drama", "1994", "Robert Zemeckis", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/saHP97rTPS5eLmrLQEcANmKrsFl.jpg"),
            Movie("Matrix", "Action", "1999", "Lilly Wachowski", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg"),
            Movie("The Lord of The Rings: The Fellowship of the Ring", "Adventure", "2001", "Peter Jackson", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/6oom5QYQ2yQTMJIbnvbkBL9cHo6.jpg"),
            Movie("La vita è bella", "Comedy & Drama", "1997", "Roberto Benigni", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/74hLDKjD5aGYOotO6esUVaeISa2.jpg"),
            Movie("The Fight Club", "Drama", "1999", "David Fincher", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wR5HZWdVpcXx9sevV1bQi7rP4op.jpg"),
            Movie("Gladiator", "Action", "2000", "Ridley Scott", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/pRn3TJHbAqCAO6U8Dw5DayVUuX3.jpg")
        )
    )

    override fun getMovies(): LiveData<List<Movie>> {
        return movies
    }

}