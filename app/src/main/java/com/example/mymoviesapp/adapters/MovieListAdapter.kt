package com.example.mymoviesapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mymoviesapp.R
import com.example.mymoviesapp.models.Movie

class MovieListAdapter(private val movies: List<Movie>, private val context: Context)
    : RecyclerView.Adapter<MovieListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.movie_cell, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(item: Movie){
            TODO("Not yet Implement")
            /*Glide.with(context).load(item.image).into(itemView.imageView_image)
            itemView.textView_title.text = item.title
            itemView.textView_director.text = item.director
            itemView.textView_year.text = item.year
            itemView.textView_genre.text = item.genre*/
        }
    }

}