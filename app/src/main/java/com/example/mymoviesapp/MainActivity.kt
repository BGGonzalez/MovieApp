package com.example.mymoviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mymoviesapp.domain.MoviesRepositoryImplement
import com.example.mymoviesapp.viewmodels.MoviesViewModel
import com.example.mymoviesapp.viewmodels.MoviesViewModelFactory

class MainActivity : AppCompatActivity() {

    //Intance only when used
    private val moviesViewModel by lazy {
        ViewModelProvider(this, MoviesViewModelFactory(MoviesRepositoryImplement())).get(MoviesViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moviesViewModel.getMovies().observe(this, Observer{ movies->
            println(movies)
        })
    }
}